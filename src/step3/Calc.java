package step3;

import javax.swing.JOptionPane;;
/**
 * 입력받은 두 수와 OPCODE에 따른 결과를 출력해주는 계산기프로그램
 */
public class Calc {
	public static String[] calculator(String[] params) {
		switch (params[1]) {
		case "+":
			params[3] += " + " + params[2];
			params[0] = String.valueOf(Integer.parseInt(params[0]) + Integer.parseInt(params[2]));
			break;
		case "-":
			params[3] += " - " + params[2];
			params[0] = String.valueOf(Integer.parseInt(params[0]) - Integer.parseInt(params[2]));
			break;
		case "*":
			params[3] += " * " + params[2];
			params[0] = String.valueOf(Integer.parseInt(params[0]) * Integer.parseInt(params[2]));
			break;
		case "/":
			params[3] += " / " + params[2];
			params[0] = String.valueOf(Integer.parseInt(params[0]) / Integer.parseInt(params[2]));
			break;
		case "%":
			params[3] += " % " + params[2];
			params[0] = String.valueOf(Integer.parseInt(params[0]) % Integer.parseInt(params[2]));
			break;
		}
		return params;
	}
	public static void main(String[] args) {
		String[] params = new String[5];
		params[0] = JOptionPane.showInputDialog("num?"); // 총 합
		params[3] = params[0]; // 과정출력용
		while (true) {
			params[1] = JOptionPane.showInputDialog("op?");
			if (params[1].equals("=")) {
				JOptionPane.showMessageDialog(null, params[3] + " = " + params[0]);
				return;
			}
			params[2] = JOptionPane.showInputDialog("num?");
			params = calculator(params);
		}
	}
}