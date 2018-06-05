package step4;

public class Diamond {

	public static void main(String[] args) {
		int k = 0;
		int s = 3, e = 1;
		int[][] mtx = new int[5][5];
		for (int i = 0; i < 5; i++) {
			if (i <= 2) {
				s--;
				e++;
			} else {
				s++;
				e--;
			}
			for (int j = s; j <= e; j++) {
				if (i <= 2) {
					mtx[i][j] = ++k;
				} else {
					mtx[i][j] = ++k;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(mtx[i][j]);
			}
			System.out.println();
		}
	}
}
