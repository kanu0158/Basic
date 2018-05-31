package step2;
/**
[수열012] 홀수짝수의 합계
 * */
import java.util.Scanner;

public class Seq012 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("0.STOP 1.ODD 2.EVEN");
			switch (s.nextInt()) {
			case 0:return;
			case 1:
				System.out.println("num1?");
				int num1 = s.nextInt();
				System.out.println("num2?");
				int num2 = s.nextInt();

				if (num1 > num2) {
					int temp = num1;
					num1 = num2;
					num2 = temp;
				}
				int start = num1, end = num2, sum = 0, totalCount = 0, count = 0;
				String result = "";
				for(int i=start;i<=end;i++) {
					if(i%2==1) {
						totalCount++;
					}
				}

				for (int i = start; i <= end; i++) {
					if (i % 2 == 1) {
						count++;
						if (count == totalCount) {
							result += i + "=";
						} else {
							result += i + "+";
						}
						sum += i;
					}
				}
				System.out.println(result + sum);
				break;
			case 2:
				System.out.println("num1?");
				num1 = s.nextInt();
				System.out.println("num2?");
				num2 = s.nextInt();

				if (num1 > num2) {
					int temp = num1;
					num1 = num2;
					num2 = temp;
				}
				start = num1;
				end = num2;
				sum = 0;
				totalCount = 0;
				count = 0;
				result = "";
				
				for(int i=start;i<=end;i++) {
					if(i%2==0) {
						totalCount++;
					}
				}

				for (int i = start; i <= end; i++) {
					if (i % 2 == 0) {
						count++;
						if (count == totalCount) {
							result += i + "=";
						} else {
							result += i + "+";
						}
						sum += i;
					}
				}
				System.out.println(result + sum);
				break;
			default:
				return;
			}
		}
	}
}
