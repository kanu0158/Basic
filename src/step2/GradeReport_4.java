package step2;

import java.util.Scanner;

/**
 * 이름, 국어점수, 영어점수, 수학점수를 입력받아 이름과 평균 등급을 출력하는 프로그램 점수를 입력할 때 0미만 100초과하는 값을 입력하면
 * 사용자에게 error메시지를 출력 평균 90 이상 = A 평균 80 이상 = B 평균 70 이상 = C 평균 60 이상 = D 60미만 =
 * F + 배열,메소드로 분할
 */
public class GradeReport_4 {
	public static boolean input(String flag) {
		return (Integer.parseInt(flag) >= 0 && Integer.parseInt(flag) <= 100);
	}

	public static String[] getTotal(String[] params) {
		params[0] = String
				.valueOf(Integer.parseInt(params[0]) + Integer.parseInt(params[1]) + Integer.parseInt(params[2]));
		params[1] = String.valueOf(Integer.parseInt(params[0]) / 3);
		return params;
	}

	public static String[] getGrade(String[] params) {
		switch (Integer.parseInt(params[1]) / 10) {
		case 10:
		case 9:
			params[2] = "A";
			break;
		case 8:
			params[2] = "B";
			break;
		case 7:
			params[2] = "C";
			break;
		case 6:
			params[2] = "D";
			break;
		default:
			params[2] = "F";
			break;
		}
		return params;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("이름?");
		String name = s.next();
		String[] params = new String[3];
		String[] subjects = { "국어", "영어", "수학" };
		for (int i = 0; i < params.length; i++) {
			System.out.println(subjects[i] + " 점수?");
			String temp = s.next();
			if (input(temp)) {
				params[i] = temp;
			} else {
				i--;
			}
		}
		params = getGrade(getTotal(params));
		System.out.println("********************************");
		System.out.println("|이름\t|총점\t|평균\t|등급\t|");
		System.out.println("|"+name + "\t|" + params[0] + "\t|" + params[1] + "\t|" + params[2] + "\t|");
		System.out.println("********************************");
	}
}
