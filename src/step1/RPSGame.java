package step1;
import java.util.Scanner;
/**
 두 사람에게 각각 가위 바위 보 중 하나씩 받아서 결과를 출력해주는 프로그램
 * */
public class RPSGame{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("A? ROCK(1) PAPER(2) SCISSORS(3)");
		int a = sc.nextInt();
		System.out.println("B? ROCK(1) PAPER(2) SCISSORS(3)");
		int b = sc.nextInt();

		if((a==1 && b==1) || (a==2 && b==2) || (a==3 && b==3)){
			System.out.println("DRAW.");
		}else{
			if((a==1 && b==3) || (a==2 && b == 1) || (a==3 && b == 2)){
				System.out.println("A win");
			}else{
				System.out.println("B win");
			} 
		}
	}
}