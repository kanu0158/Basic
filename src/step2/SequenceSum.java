package step2;
import java.util.Scanner;
/**
기사시험문제: [수열1] 1+2+3+...+100 까지의 합계
변형된 요구사항:
정수를 입력받아 두 수 사이의 합을 구하는 프로그램을 구현하시오
출력 : 1+2+3+...+10=55
 * */
public class SequenceSum {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.println("0.stop 1.start");
			switch(sc.nextInt()) {
				case 0:System.out.println("exit!");return;
				case 1: System.out.println("num1?");
						int num1 = sc.nextInt();
						System.out.println("num2?");
						int num2 = sc.nextInt();
						if(num1>num2) {
							int temp = num1;
							num1 = num2;
							num2 = temp;
						}
						int sum = 0;
						String op = "+", result = "";
						for(int i=num1;i<=num2;i++) {
							sum += i;
							if(i==num2) {
								op = "=";
							}
							result += i + op;
						}
						System.out.println(result + sum);
					    break;
				default:System.out.println("error");break;
			}
		}
	}
}
