package step4;

public class MatrixVertical {

	public static void main(String[] args) {
		int k=0;
		int v=4;
		int[][] mtx = new int[5][5];
		/*for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				mtx[i][j] = ++k;
			}
		}
		*/
		for(int i=0;i<5;i++) {
			for(int j=v;j<5;j++) {
				 mtx[i][j]=++k;
				}
			v--;
			}

		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(mtx[i][j]);
			}
			System.out.println();
		}
	}
}
