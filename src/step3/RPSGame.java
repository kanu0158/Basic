package step3;

import javax.swing.JOptionPane;

/**
 * 두 사람에게 각각 가위 바위 보 중 하나씩 받아서 결과를 출력해주는 프로그램
 */
public class RPSGame {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("몇전?"));
		int count = 0, AWin = 0, BWin = 0, Draw = 0;
		while (true) {
			if (count == num) {
				String result = "";
				if (AWin - BWin == 0) {
					result = "DRAW!";
				} else if (AWin - BWin > 0) {
					result = "A WIN!";
				} else {
					result = "B WIN!";
				}
				JOptionPane.showMessageDialog(null,"a: " + AWin + "승" + "\nb: " + BWin + "승" + "\nDRAW: " + Draw + "\n" + result);
				return;
			}
			int a = 0;
			a = (int) (Math.random() * 10) % 3;
			if (a < 0 && a > 2) {
				continue;
			}


			int b = Integer
					.parseInt(JOptionPane.showInputDialog((count + 1) + "번째\n" + "B? SCISSORS(0) ROCK(1)  PAPER(2) "));
			int flag = a - b;
			String[] srp = { "SCISSORS", "ROCK", "PAPER" };
			switch (flag) {
			case -2:
			case 1:
				AWin++;
				JOptionPane.showMessageDialog(null, "A: " + srp[a] + "\nB: " + srp[b] + "\nA win ");
				break;
			case 2:
			case -1:
				BWin++;
				JOptionPane.showMessageDialog(null, "A: " + srp[a] + "\nB: " + srp[b] + "\nB win ");
				break;
			default:
				Draw++;
				JOptionPane.showMessageDialog(null, "A: " + srp[a] + "\nB: " + srp[b] + "\nDRAW ");
				break;
			}
			count++;
		}
	}
}