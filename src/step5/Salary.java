package step5;

import javax.swing.JOptionPane;

enum Butt {
	EXIT, INPUT, LIST
}

public class Salary {
	public static void main(String[] args) {
		String[][] mtx = new String[5][5];
		Butt[] buttons = { Butt.EXIT, Butt.INPUT, Butt.LIST };
		String[] column = { "부서", "성명", "본봉", "수당", "합계" };
		String[] input = new String[4];
		int r = 0;
		while (true) {
			Butt select = (Butt) JOptionPane.showInputDialog(null, // frame
					"부서별 합계", // frame title
					"기능을 선택하시오", // order
					JOptionPane.QUESTION_MESSAGE, // type
					null, // icon
					buttons, // Array of choices
					buttons[1]// default
			);
			switch (select) {
			case EXIT:
				return;
			case INPUT:
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 5; j++) {
						if (j == 4) {
							mtx[i][j] = String.valueOf(Integer.parseInt(mtx[i][2]) + Integer.parseInt(mtx[i][3]));
						} else {
							mtx[i][j] = JOptionPane.showInputDialog(column[j]);
						}

					}
				}
				break;
			case LIST:
				String result = "";
				for (int i = 0; i < 5; i++) {
					result += column[i] + "  ";
				}
				result += "\n";
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 5; j++) {
						result += mtx[i][j] + "   ";
					}
					result += "\n";
				}
				JOptionPane.showMessageDialog(null, result);
				break;
			default:
				break;
			}
		}
	}
}
