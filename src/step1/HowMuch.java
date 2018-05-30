package step1;
import java.util.Scanner;
/**
 가격과 개수 DC를 입력 받아 DC가 10미만이면 총액을 계산해서 출력하고
 DC가 10이상이면 안판다고 출력하는 프로그램 
 * */
public class HowMuch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("0.stop 1.start");
			switch(sc.nextInt()) {
				case 0:System.out.println("exit!");return;
				case 1: System.out.println("How much?");
						int price = 0;
						price = sc.nextInt();
						System.out.println(price +" won.");
						System.out.println("How many?");
						int num = 0;
						num = sc.nextInt();
						System.out.println(num+" number please");
						int sum = price * num;
						System.out.println("total " + sum + " won");
						System.out.println("Too expensive DC please");
						System.out.println(" %DC?");
						int dc = 0;
						dc = sc.nextInt();
						String output = "NONO";
			 	
						if(dc < 10){
							output = sum * (100 - dc)/100 + "won";
						}

						System.out.println(output);
						break;
				default:break;
			}
		}
	}
}