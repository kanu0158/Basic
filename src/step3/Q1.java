package step3;
import javax.swing.JOptionPane;
public class Q1 {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("이름?");
		int totalCost = Integer.parseInt(JOptionPane.showInputDialog("출장비지급액?"));
		int[] dan = {50000,10000,5000,1000,500,100,50,10,5,1};
		int[] result = new int[10];
		int cost = totalCost;
		for(int i=0;i<10;i++) {
			result[i] = cost/dan[i];
			cost = cost % dan[i];
		}
		String output= "";
		for(int i=0;i<10;i++) {
			if(result[i] == 0) {
				output +=  "        ";
			}else {
				output += result[i] + "       ";
			}
			
		}
		JOptionPane.showMessageDialog(null,"출장비 지급표\n성명 출장비지급액 오만 일만 오천 일천 오백 일백 오십 일십 오 일\n"+name+"  "+ totalCost + "        "+output);
	}
}
