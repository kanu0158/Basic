package step4;

public class Diagonal {
	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int k = 0, v = 1;
		for (int i = 0; i <= 8; i++) {
			for (int j = 0; j <= 4; j++) {
				k = i - j;
				if (k < 0 || k > 4) {
					continue;
				}
				mtx[j][k] = v++;
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
