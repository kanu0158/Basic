package step1;
import java.util.Scanner;
/**
  월을 입력해서 해당 월의 마지막 날을 알려주는 로직.
  예를 들면, 3월이면 말일이 3월31일입니다.
  9월이면 말일이 9월30일입니다.라고 알려줌.
  단 2월은 2월28일을 말일로 해서 2월28일입니다.  라고 함.
 * */
public class Calendar{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("0.stop 1.start");
			switch(sc.nextInt()){
				case 0:System.out.println("exit!");return;
				case 1: System.out.println("month?");
						int mon = sc.nextInt();
						String end = "";
						switch(mon){
							case 1:
							case 3:
							case 5:
							case 7:
							case 8:
							case 10:
							case 12:end = "31";break;
							case 4: 
							case 6:
							case 9:
							case 11:end = "30";break;
							case 2:end = "28";break;
						}
						System.out.println(mon + "month is " + end +"day.");
						break;
			}
		}
		
	}
}