package step2;
/**
 [수열002] 1-2+3-4+5-6....-100 = -50 합계 
 * */
public class Seq011 {

	public static void main(String[] args) {
		int evenSum = 0, oddSum=0;
		String result = "";
		for(int i=1;i<=100;i++) {
			if(i==100) {
				evenSum += i;
				result += i + "=";
				break;
			}
			if(i%2 == 0) {
				evenSum += i;
				result += i + "+";
			}else {
				oddSum += i;
				result += i + "-";
			}
		}
		int sum = oddSum - evenSum;
		System.out.println(result + sum);
	}
}
