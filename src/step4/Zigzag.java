package step4;

public class Zigzag {

	public static void main(String[] args) {
		int k = 0;
		int s = 0, e = 4;
		int[][] mtx = new int[5][5];
/*    	for (int i = 0; i < 5; i++) {
			if(i%2==0) {
				s=0;
				e=5;
			}else {
				s=4;
				e=-1;
			}
			for (int j = s; j != e;) {
				if(i%2==0) {
					mtx[i][j] = ++k;
					j++;
				}else {
					mtx[i][j] = ++k;
					j--;
				}
			}
		}
*/
		for(int i=0;i<5;i++) {
			for(int j=s;j!=e;) {
				if(i%2==0) {
					s=4;
					e=5;
					mtx[i][j] = ++k;
					j++;
				}else {
					s=0;
					e=-1;
					mtx[i][j] = ++k;
					j--;
				}
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.printf("["+"%d"+"]",mtx[i][j]);
			}
			System.out.printf("\n");
		}
	}
}
