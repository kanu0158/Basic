package step3;
import javax.swing.JOptionPane;

public class Starbucks3_slack {
	public static int getItemPrice(String count,int i){
		int[] prices = {3000,3500,4000};
		return Integer.parseInt(count)*prices[i];
	}
	public static void main(String[] args) {
		String result = "";
		int totalPrice = 0;
		while(true){
			
			String option = JOptionPane.showInputDialog(
					"0주문완료 \n"
					+ "1아메리카노3000\n"
					+ "2라떼3500\n"
					+ "3카푸치노4000\n");
			//String count = "";
			String[] menu = {"아메리카노","라떼","카푸치노"};
			int price=0;
			switch(option){
			case "0" : 
				JOptionPane.showMessageDialog(null, "결재금액: "+totalPrice);
				return;
			case "1" :case "2" : case "3" : 
				
				totalPrice += getItemPrice(JOptionPane.showInputDialog("몇잔?"),	Integer.parseInt(option)-1);break;
			
			}
		}
	}
}