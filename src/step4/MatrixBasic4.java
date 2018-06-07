package step4;

public class MatrixBasic4 {

	public static void main(String[] args) {
		int k=0;
		int[][] mtx = new int[5][5];
		for(int j=0;j<5;j++) {
			for(int i=4;i>=0;i--) {
				mtx[i][j] = ++k;
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
