package step4;

public class Triangle {

	public static void main(String[] args) {
		int k = 0;
		int s = 4,e = 4, count = 0;
		int r= 3, c=0;
		int[][] mtx = new int[7][4];
		/*for (int j = 0; j < 4; j++) {//이중for-loop 사용한 경우
			s=3-j;
			e=j+3;
			for (int i = s; i <= e; i++) {
					mtx[i][j] = ++k;
			}
		}*/
		int n=1;
		for(int i=1;i<=16;i++) {//for-loop 하나만 사용한 경우
				mtx[r][c] = ++k;
				r++;
				if(i == n*n) {
					r = 3-n;
					c++;
					n++;
				}
		}
		for(int i=0;i<7;i++) {
			for(int j=0;j<4;j++) {
				System.out.printf("["+"%d"+"]",mtx[i][j]);
			}
			System.out.printf("\n");
		}
	}
}
