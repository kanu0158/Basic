package step4;

public class Snail {

	public static void main(String[] args) {
		int k = 0;
		int x=0,y=-1,option =1, count = 4;
		int[][] mtx = new int[5][5];
		for (int i = 0; i < 5; i++) {
				for (int j = 0; j <= count;j++) {
					y += option;
					mtx[x][y] = ++k;
				}
				count--;
				for (int j = 0; j <= count;j++) {
					x += option;
					mtx[x][y] = ++k;
				}
				option *= -1;
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(mtx[i][j]);
			}
			System.out.println();
		}
	}
}
