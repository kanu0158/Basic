package step3;

import java.util.Scanner;

public class Starbucks {
	public static boolean input(int num) {
		return (num < 0);
	}

	public static int getTotal(String[] params) {
		int result = 0;
		int[] menu = { 0, 3000, 3500, 4000 };
		int price = menu[Integer.parseInt(params[0])]; // 3000원 3500원 4000원
		result = price * Integer.parseInt(params[1]);

		return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] params = new String[10];
		String[] tempParams = new String[2];
		String[] menu = {"아메리카노","라떼","카푸치노"};
		int sum = 0;
		while (true) {
			System.out.println("무엇으로 몇잔 드릴까요");
			System.out.println(" 0.종료\n " + "1.아메리카노3000\n " + "2.라떼3500\n " + "3.카푸치노4000\n");
			String str = s.next();
			tempParams = str.split(",");
			if (Integer.parseInt(tempParams[0]) == 0) {
				break;
			} else {
				int temp = Integer.parseInt(tempParams[1]);
				if (input(temp)) {
					System.out.println("다시");
					continue;
				}else {
					params[0] = tempParams[0];
					params[1] = tempParams[1];
					System.out.println(menu[Integer.parseInt(params[0]) - 1] +" " +params[1] + " 잔 ");
				}
				sum += getTotal(params);
			}
		}
		System.out.println("총 결제 금액은 " + sum + "입니다.");
	}
}
