package step4;

public class LeftTriangle {
	public static void main(String[] args) {
		int k = 0;
		int v = 4;
		int[][] mtx = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				mtx[i][j] = ++k;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("[" + "%d" + "]", mtx[i][j]);
			}
			System.out.printf("\n");
		}
	}
}
