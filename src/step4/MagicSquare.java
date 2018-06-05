package step4;

public class MagicSquare {
	public static void main(String[] args) {
		int k = 0;
		int x=1,y=1, n_x=0,n_y=0;
		int[][] mtx = new int[5][5];
		for (int i = 0; i < 5; i++) {
				for (int j = 0; j <= 4;j++) {
					x--;
					y++;
					System.out.println(x+"f"+y);
					if(x<0) {
						x = 4;
					}
					if(y>4) {
						y = 1;
					}
					n_x = x - 1;
					n_y = y + 1;
					if(n_x<0) {
						x = 4;
					}
					if(n_y>4) {
						y = 1;
					}
					//System.out.println(x+"d"+y+"d"+mtx[4][3]);
					if(mtx[4][3] == 0) {
						mtx[x][y] = ++k;
					}else {
						x++;
						mtx[x][y] = ++k;
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
