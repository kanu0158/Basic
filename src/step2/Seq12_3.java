package step2;

/**
[수열012] 홀수짝수의 합계
 * */
import java.util.Scanner;

public class Seq12_3 {
	public static int[] input(Scanner s) {
		int[] result = new int[2];
		System.out.println("num1?");
		int num1 = s.nextInt();
		System.out.println("num2?");
		int num2 = s.nextInt();
		int start = 0, end = 0;
		if (num1 > num2) {
			start = num2;
			end = num1;
		} else {
			start = num1;
			end = num2;
		}
		result[0] = start;
		result[1] = end;
		return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("0.STOP 1.ODD 2.EVEN");
			switch (s.nextInt()) {
			case 0:
				return;
			case 1:
				int start = 0, end = 0, sum = 0, totalCount = 0, count = 0;
				int[] arr = input(s);
				start = arr[0];
				end = arr[1];
				String result = "";
				for (int i = start; i <= end; i++) {
					if (i % 2 == 1) {
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
				arr = input(s);
				start = arr[0];
				end = arr[1];
				sum = 0;
				totalCount = 0;
				count = 0;
				result = "";

				for (int i = start; i <= end; i++) {
					if (i % 2 == 0) {
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
