package step2;
/**
[수열012-1] 홀수짝수의 합계 + 메소드분할
 * */
import java.util.Scanner;

public class Seq012_2 {
	public static String func(int label,int num1,int num2) {
		int flag = 0;
		switch(label) {
			case 1:flag=1;break;
			case 2:flag=0;break;
		}
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		int start = num1, end = num2, sum = 0, totalCount = 0, count = 0;
		String result = "";
		for(int i=start;i<=end;i++) {
			if(i%2==flag) {
				totalCount++;
			}
		}
		for (int i = start; i <= end; i++) {
			if (i % 2 == flag) {
				count++;
				if (count == totalCount) {
					result += i + "=";
				} else {
					result += i + "+";
				}
				sum += i;
			}
		}
		return result+sum;
	}

	public static void main(String[] args) {
		while (true) {
			Scanner s = new Scanner(System.in);
			System.out.println("0.STOP 1.ODD 2.EVEN");
			switch (s.nextInt()) {
			case 0:return;
			case 1:
				System.out.println("num1?");
				int num1 = s.nextInt();
				System.out.println("num2?");
				int num2 = s.nextInt();
				System.out.println(func(1,num1,num2));
				break;
			case 2:
				System.out.println("num1?");
				num1 = s.nextInt();
				System.out.println("num2?");
				num2 = s.nextInt();
				System.out.println(func(2,num1,num2));
				break;
			default:
				return;
			}
		}
	}
}
