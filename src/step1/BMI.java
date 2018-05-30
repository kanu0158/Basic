package step1;
import java.util.Scanner;
/**
 BMI = 몸무게 / 키²
 18.5 미만이면 저체중
 18.5∼23은 정상
 23~25이면 '비만 전단계'
 25∼30은 '1단계 비만'
 30∼35는 '2단계 비만'
 35 이상이면 '3단계 비만'으로 구분 
 * */
public class BMI{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("0.stop 1.start");
			int flag = sc.nextInt();
			switch(flag){
				case 0:
					   System.out.println("exit!");
					   return;
				case 1:
					   System.out.println("weight?");
					   int w = sc.nextInt();
					   System.out.println("tall?");
					   int t = sc.nextInt();
					   double dt = (double)t/100;
			   		   double bmi = (double)w/(dt*dt);
					   System.out.println("bmi = " + bmi);
					   String result = "";
					   if(bmi >= 35){
		 					result ="3단계비만";
					   }else if(bmi >= 30 && bmi < 35){
							result ="2단계비만";
					   }else if(bmi >= 25 && bmi < 30){
							result = "1단계비만";
					   }else if(bmi >= 23 && bmi < 25){
							result ="비만전단계";
					   }else if(bmi >= 18.5 && bmi < 23){
							result = "정상";
					   }else{
							result="저체중";
					   }
					   System.out.println(result);
					   break;
				default:System.out.println("error");break;
			}
			
		}
	}
}
