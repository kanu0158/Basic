package step5;

import javax.swing.JOptionPane;

enum Butt{
	EXIT,
	INPUT,
	LIST
}
public class Salary {
	public static void main(String[] args) {
		String[][] mtx = new String[5][5];
		Butt[] buttons = {
				Butt.EXIT,
				Butt.INPUT,
				Butt.LIST
		};
		String[] column = {"부서","성명","본봉","수당","합계"};
		String[] input = new String[4];
		int r=0;
		while(true) {
			Butt select = (Butt) JOptionPane.showInputDialog(null,//frame
					"부서별 합계",//frame title
					"기능을 선택하시오",//order
					JOptionPane.QUESTION_MESSAGE,//type
					null,//icon
					buttons,//Array of choices
					buttons[1]//default
					);
			switch(select) {
			case EXIT:return;
			case INPUT:
				for(int i=0;i<4;i++) {
					input[i] = JOptionPane.showInputDialog(column[i]);
					mtx[r][i] = input[i];
				}
					mtx[r][4] = String.valueOf(Integer.parseInt(mtx[r][2])+Integer.parseInt(mtx[r][3]));
					r++;
				break;
			case LIST:
				String result = "";
				for(int i=0;i<5;i++) {
					result += column[i] + "  ";
				}
				result += "\n";
				for(int i=0;i<4;i++) {
					for(int j=0;j<5;j++) {
						result += mtx[i][j] + "   ";
					}
					result += "\n";
				}
				//JOptionPane.showMessageDialog(null, result);
				JOptionPane.showMessageDialog(null,mtx);
				break;
			default:
				break;
			}
		}
	}
}
