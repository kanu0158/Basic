package step4;

public class SnailInvert {

	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int k=1,r=-1,c=0,option=1,count=5;
		for(int i=0;i<5;i++) {
			for(int j=0;j<count;j++) {
				r += option;
				mtx[r][c] = k++;
			}
			count--;
			for(int j=0;j<count;j++) {
				c += option;
				mtx[r][c] = k++;
			}
			option *= -1;
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.printf("["+"%d"+"]",mtx[i][j]);
			}
			System.out.printf("\n");
		}
	}
}
