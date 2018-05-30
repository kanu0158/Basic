package step1;
import java.util.Scanner;
/**
 두 수를 입력받고 작은 값부터 큰 값까지의 합과 과정을 출력하는 프로그램
 * */
public class Series{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("0.stop 1.start");
			switch(sc.nextInt()){
				case 0:System.out.println("exit");return;
				case 1:System.out.println("num1?");
					   int num1 = sc.nextInt();
					   System.out.println("num2?");
					   int num2 = sc.nextInt();
					   int min=0, max=0;
					   if(num1>num2){
					   	max = num1;
					   	min = num2;
					   }else{
					   	max = num2;
					   	min = num1;
					   }
					   String result = "";
					   String op = " + ";
					   int sum = 0;
		
					   for(int i=min;i<=max;i++){
					   	if(i==max){
					   		op = " = ";
					   	}
					   	sum += i;
					   	result += i + op;
					   }
					   System.out.println(result+sum);
					   break;
				default:System.out.println("error");break;
			}

		}
	}
}