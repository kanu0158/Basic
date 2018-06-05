package step3;

import javax.swing.JOptionPane;

public class ArrayTest {
	public static int getTotal(String[] scores) {
		return Integer.parseInt(scores[1]) + Integer.parseInt(scores[2]) + Integer.parseInt(scores[3]);
	}
	public static int[] getAverage(int total) {
		int[] totalAvg = new int[2];
		totalAvg[0] = total;
		totalAvg[1] = total / 3;
		return totalAvg;
	}
	public static String[] getGrade(int[] totalAvg) {
		String[] totalAvgGrade = new String[3];
		totalAvgGrade[0] = String.valueOf(totalAvg[0]);
		totalAvgGrade[1] = String.valueOf(totalAvg[1]);
		switch (totalAvg[1] / 10) {
		case 10:
		case 9:
			totalAvgGrade[2] = "A";
			break;
		case 8:
			totalAvgGrade[2] = "B";
			break;
		case 7:
			totalAvgGrade[2] = "C";
			break;
		case 6:
			totalAvgGrade[2] = "D";
			break;
		default:
			totalAvgGrade[2] = "F";
			break;
		}
		return totalAvgGrade;
	}
	public static void getList(String[] list, String result) {
		for (int i = 0; i < 5; i++) {
			if (list[i] == null) {
				list[i] = result;
				break;
			}
		}
	}
	public static void getRank(String[] ranking, String[] list) {
		String result = "";
		int[] total = new int[3];
		for (int i = 0; i < list.length; i++) {
			String[] score = list[i].split("\\|");
			total[i] = Integer.parseInt(score[4]);
		}
		if (total[0] > total[1] && total[0] > total[2]) {
			if (total[1] > total[2]) {
				// a>b>c
				ranking[0] = list[0];
				ranking[1] = list[1];
				ranking[2] = list[2];
			} else {
				// a>c>b
				ranking[0] = list[0];
				ranking[1] = list[2];
				ranking[2] = list[1];
			}
		} else if (total[1] > total[2]) {
			if (total[0] > total[2]) {
				// b>a>c
				ranking[0] = list[1];
				ranking[1] = list[0];
				ranking[2] = list[2];
			} else {
				// b>c>a
				ranking[0] = list[1];
				ranking[1] = list[2];
				ranking[2] = list[0];
			}
		} else {
			if (total[0] > total[1]) {
				// c>a>b
				ranking[0] = list[2];
				ranking[1] = list[0];
				ranking[2] = list[1];
			} else {
				// c>b>a
				ranking[0] = list[2];
				ranking[1] = list[1];
				ranking[2] = list[0];
			}
		}
	}
	public static void main(String[] args) {
		String[] list = new String[3];
		String[] ranking = new String[3];
		while (true) {
			String menu = JOptionPane.showInputDialog("0.종료 1.성적입력 2.전체보기 3.순위출력");
			switch (menu) {
			case "0":
				return;
			case "1":
				String result = "";
				String score = JOptionPane.showInputDialog("이름/국어/영어/수학");
				String[] arr = score.split("/");
				String[] totalAvgGrade = getGrade(getAverage(getTotal(arr)));
				result = arr[0] + "|" + arr[1] + "|" + arr[2] + "|" + arr[3] + "|" + totalAvgGrade[0] + "|"
						+ totalAvgGrade[1] + "|" + totalAvgGrade[2];
				getList(list, result);
				JOptionPane.showMessageDialog(null, result);
				break;
			case "2":
				JOptionPane.showMessageDialog(null, list);
				break;
			case "3":
				getRank(ranking, list);
				result = ranking[0] + "\n" + ranking[1] + "\n" + ranking[2];
				JOptionPane.showMessageDialog(null, result);
				break;
			default:
				break;
			}

		}
	}

}
