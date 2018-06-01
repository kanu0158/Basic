package step2;
import java.util.Scanner;
/**
 이름, 국어점수, 영어점수, 수학점수를 입력받아 이름과 평균 등급을 출력하는 프로그램
 점수를 입력할 때 0미만 100초과하는 값을 입력하면 사용자에게 error메시지를 출력
 평균 90 이상 = A
 평균 80 이상 = B
 평균 70 이상 = C
 평균 60 이상 = D
 60미만 = F
 + 배열,메소드로 분할
 * */
public class GradeReport_2{
	public static int[] input(Scanner sc) {
			int[] arr = new int[3];
			System.out.println("Korean score?");
			arr[0] = sc.nextInt();
			int ks = arr[0];
			if(ks<0 || ks >100){
				System.out.println("korean score error");
				arr[0] = -1;
				return arr;
			}
			System.out.println("English score?");
			arr[1] = sc.nextInt();
			int es = arr[1];
			if(es<0 || es >100){
				System.out.println("English score error");
				arr[0] = -1;
				return arr;
			}
			System.out.println("Math score?");
			arr[2] = sc.nextInt();
			int ms = arr[2];
			if(ms<0 || ms >100){
				System.out.println("Math score error");
				arr[0] = -1;
				return arr;
		  }
		  return arr; 
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("0.stop 1.start");
			switch(sc.nextInt()) {
				case 0:System.out.println("exit!");return;
				case 1: System.out.println("name? ");
						String name = sc.next();
						int[] arr = input(sc);
						if(arr[0] == -1) {
							break;
						}
						int total = arr[0]+arr[1]+arr[2]; 
						int avg = (arr[0]+arr[1]+arr[2])/3;
						String grade = "";
						switch(avg/10){
							case 9: grade = "A"; break;
							case 8: grade = "B"; break;
							case 7: grade = "C"; break;
							case 6: grade = "D"; break;
							default: grade = "F"; break;
						}
						if(avg == 100) {
							grade = "A";
						}
						System.out.printf("[name][total][avg ][grade]\n");
						System.out.printf("[ %s ][ %d  ][ %d ][  %s ]\n",name,total,avg,grade);
					 	break;
				default:break;
			}
		}
	}
}