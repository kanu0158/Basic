package step4;

public class MatrixConversion {
	public static void main(String[] args) {
		int[][] mtx1 = new int[5][3];
		int[][] mtx2 = new int[3][5];
		int k=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				mtx1[i][j] = ++k;
			}
		}
		int r1=0,c1=0,r2=0,c2=0;
		for(int i=0;i<15;i++) {
			mtx2[r2][c2++] = mtx1[r1][c1++];
			if(c2==5) {
				r2++;
				c2=0;
			}
			if(c1==3) {
				r1++;
				c1=0;
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				System.out.printf("["+"%d"+"]",mtx2[i][j]);
			}
			System.out.printf("\n");
		}
		
	}
}
