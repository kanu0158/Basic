package step4;

public class MagicSquare {
    public static void main(String[] args) {
        int r=0, c=2, n_r=0, n_c=0;
        int[][] mtx = new int[5][5];
        for(int i=1;i<=25;i++) {
             mtx[r][c] = i;
             n_r = r - 1;
             n_c = c + 1;
             if(n_r<0) {
                 n_r = 4;
             }
             if(n_c>4) {
                 n_c = 0;
             }
             if(mtx[n_r][n_c] == 0) {
                 r = n_r;
                 c = n_c;
             }else {
                 r++;
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