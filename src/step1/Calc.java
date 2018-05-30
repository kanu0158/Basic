package step1;
import java.util.Scanner;
/**
 입력받은 두 수와 OPCODE에 따른 결과를 출력해주는 계산기프로그램  
 * */
public class Calc{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("0.stop 1.start");
			switch(sc.nextInt()) {
				case 0: System.out.println("exit!");return;
				case 1: System.out.println("num1?");
						int num1 = sc.nextInt();
						System.out.println("op?");
						String op = sc.next();
						System.out.println("num2?");
						int num2 = sc.nextInt();
						int num3 = 0;

						if(op.equals("+")){
							num3 = num1 + num2;
						}else if(op.equals("-")){
							num3 = num1 - num2;
						}else if(op.equals("*")){
							num3 = num1 * num2;
						}else if(op.equals("/")){
							num3 = num1 / num2;
						}else{
							num3 = num1 % num2;
			
						}
						System.out.println(num1 + op + num2 + " : " + num3);
						break;
				default:break;
			}
		}
	}
}