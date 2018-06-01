package step2;

import java.util.Scanner;
/**
 * 이름, 국어점수, 영어점수, 수학점수를 입력받아 이름과 평균 등급을 출력하는 프로그램 점수를 입력할 때 0미만 100초과하는 값을 입력하면
 * 사용자에게 error메시지를 출력 평균 90 이상 = A 평균 80 이상 = B 평균 70 이상 = C 평균 60 이상 = D 60미만 =
 * F + 배열,메소드로 분할
 */
public class GradeReport_3 {
		public static boolean input(int param) {
			/*boolean flag = false;*/
		/*	if(param>=0 && param<=100){
				flag = true;
			}else{
				flag = false;
			}
			flag = (param>=0 && param<=100)?true:false;*/
			return (param>=0 && param<=100);
		}
		public static String[] getTotal(String[] params){
			//String[] result = new String[10];
			params[0] = String.valueOf(
					Integer.parseInt(params[0]) + 
					Integer.parseInt(params[1]) + 
					Integer.parseInt(params[2]));
			params[1] = String.valueOf(Integer.parseInt(params[0])/3);
			return params;
		}
		public static String[] getGrade(String[] params){
			//String[] result = new String[3];
			//result[0] = params[0];
			//result[1] = params[1];
		    switch(Integer.parseInt(params[1])/10){
	            case 9: params[2]="A"; break;
	            case 8: params[2]="B"; break;
	            case 7: params[2]="C"; break;
	            case 6: params[2]="D"; break;
	            case 5: params[2]="E"; break;
	            default : params[2]="F"; break;
	        }
		    return params;
		}
		public static void main(String[] args) {
			String[] params = new String[10];
			Scanner scan = new Scanner(System.in);
			System.out.print("이름을 입력하세요");
			String name = scan.next();
			String[] subjects = {"국어","영어","수학"};
			
			for(int i=0;i<subjects.length;i++){
				System.out.println(subjects[i]+" 점수를 입력하세요");
				int temp = Integer.parseInt(scan.next());
				if(input(temp)){
					params[i] = String.valueOf(temp);
				}else{
					i--;
				}
			}
			//String[] arr = getGrade(getTotal(params));
			params = getGrade(getTotal(params));
			System.out.printf("************************************\n");
			System.out.printf("| 이름  |  총점     |  평균    | 등급  |\n");
			System.out.printf("-------------------------------------\n");
			/*System.out.printf("| %s | %s | %s | %s |\n",
					name,arr[0],arr[1],arr[2]);*/
			System.out.printf("| %s | %s | %s | %s |\n",
					name,params[0],params[1],params[2]);
			System.out.print("************************************");
		}
}
