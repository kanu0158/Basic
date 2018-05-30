package step1;
import java.util.Scanner;
/**
 이름, 국어점수, 영어점수, 수학점수를 입력받아 이름과 평균 등급을 출력하는 프로그램
 점수를 입력할 때 0미만 100초과하는 값을 입력하면 사용자에게 error메시지를 출력
 평균 90 이상 = A
 평균 80 이상 = B
 평균 70 이상 = C
 평균 60 이상 = D
 60미만 = F
 * */
public class GradeReport{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("name? ");
		String name = sc.next();
		System.out.println("Korean score?");
		int ks = sc.nextInt();
		if(ks<0 || ks >100){
			System.out.println("korean score error");
			return;
		}
		System.out.println("English score?");
		int es = sc.nextInt();
		if(es<0 || es >100){
			System.out.println("English score error");
			return;
		}
 		System.out.println("Math score?");
		int ms = sc.nextInt();
		if(ms<0 || ms >100){
			System.out.println("Math score error");
			return;
		}

		int avg = (ks+es+ms)/3;
		String grade = "";

		switch(avg/10){
			case 9: grade = "A"; break;
			case 8: grade = "B"; break;
			case 7: grade = "C"; break;
			case 6: grade = "D"; break;
			default: grade = "F"; break;
		}
		
		System.out.println(name + " [avg] " + avg + " [grade] " + grade);
	}
}