package step5;

import javax.swing.JOptionPane;
enum GugudanButt{
	EXIT,
	OUTPUT
}
public class Gugudan {
	public static void main(String[] args) {
		while(true) {
			GugudanButt[] buttons = {
					GugudanButt.EXIT,
					GugudanButt.OUTPUT
			};
			GugudanButt select = (GugudanButt) JOptionPane.showInputDialog(null,//frame
					"구구단",//frame title
					"기능을 선택하시오",//order
					JOptionPane.QUESTION_MESSAGE,//type
					null,//icon
					buttons,//Array of choices
					buttons[1]//default
					);
			switch(select) {
			case EXIT:return;
			case OUTPUT:
				String[] result1 = new String[9];
				String[] result2 = new String[9];
				String result3 = "";
				String result4 = "\n";
				for(int i=0;i<9;i++) {
					result1[i] = "";
					result2[i] = "";
					for(int j=0;j<4;j++) {
						result1[i] += (j+2) + " x " + (i+1) + " = " + (j+2)*(i+1) + "   ";
						result2[i] += (j+6) + " x " + (i+1) + " = " + (j+6)*(i+1) + "   "; 
					}
					result1[i] += "\n";
					result3 += result1[i];
					result2[i] += "\n";
					result4 += result2[i];
				}
				result4 = result3 + result4;
				JOptionPane.showMessageDialog(null, result4);
				break;
			}
		}
	}
}
