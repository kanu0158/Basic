package step4;

public class MatrixVertical5 {

	public static void main(String[] args) {
		int k = 0;
		int e = 7;
		int[][] mtx = new int[7][7];
		for (int i = 0; i < 7; i++) {
			if (i <= 3) {
				e--;
			} else {
				e++;
			}
			for (int j = 0; j <= e; j++) {
					mtx[i][j] = ++k;
			}
		}
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(mtx[i][j]);
			}
			System.out.println();
		}
	}
}
