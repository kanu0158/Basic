package step3;
import javax.swing.JOptionPane;// no Frame 상태일 때 

public class Starbucks2 {
	public static boolean input(int num) {
		return (num < 0);
	}
	public static int getTotal(String[] params) {
		int result = 0;
		int[] menu = {3000, 3500, 4000 };
		int price = menu[Integer.parseInt(params[0])-1]; // 3000원 3500원 4000원
		result = price * Integer.parseInt(params[1]);
		return result;
	}
	public static void main(String[] args) {
		//JOptionPane s = new JOptionPane(); 생략가능 
		String[] params = new String[10];
		
		int sum = 0;
		while (true) {
			String str = JOptionPane.showInputDialog(" 0.주문완료\n " + "1.아메리카노3000\n " + "2.라떼3500\n " + "3.카푸치노4000\n" + "\n무엇으로 드릴까요");
			String[] menu = {"아메리카노","라떼","카푸치노"};
			if(Integer.parseInt(str) >= 4 || Integer.parseInt(str) < 0) {
				continue;
			}
			if (Integer.parseInt(str) == 0) {
				JOptionPane.showMessageDialog(null,"총 결제 금액은 " + sum + "원 입니다." );
				return;
			} else {
				String str2 = JOptionPane.showInputDialog("몇 잔 드릴까요?");
				int temp = Integer.parseInt(str2);
				if (input(temp)) {
					JOptionPane.showMessageDialog(null, "잘못 입력했습니다.");
					continue;
				}else {
					params[0] = str;
					params[1] = str2;
					JOptionPane.showMessageDialog(null, menu[Integer.parseInt(params[0])-1] +" " + params[1] + "잔을 선택");
				}
				sum += getTotal(params);
			}
		}
	}
}

