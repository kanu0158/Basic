package step4;

public class Triangle {

	public static void main(String[] args) {
		int k = 0;
		int s = 4,e = 4, count = 0;
		int[][] mtx = new int[7][4];
		for (int j = 0; j < 4; j++) {
			s=3-j;
			e=j+3;
			for (int i = s; i <= e; i++) {
					mtx[i][j] = ++k;
			}
		}
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(mtx[i][j]);
			}
			System.out.println();
		}
	}
}
