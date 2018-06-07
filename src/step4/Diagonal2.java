package step4;

public class Diagonal2 {
	public static void main(String[] args) {
		int k=-1,r=0,c=0,v=1;
		int[][] mtx = new int[5][5];
		/*for(int i=0;i<9;i++) {
			for(int j=0;j<=4;j++) {
				//k = i-j; //00부터 7시방향
				k = 4-(i-j);//44부터 5시방향
				if(k < 0 || k > 4) {
					continue;
				}
				mtx[j][k] = v++;
			}
		}*/
		/*for(int i=0;i<9;i++) {
			for(int j=4;j>=0;j--) {
				//k = i-j; //00부터 1시방향
				k = 4-(i-j);//44부터 11시방향
				if(k < 0 || k > 4) {
					continue;
				}
				mtx[j][k] = v++;
			}
		}*/
		/*for(int i=0;i<9;i++) {
			for(int j=0;j<=4;j++) {
				//k = (i-j);//40부터 11시방향
				k = 4-(i-j);//44부터 1시방향 
				if(k < 0 || k > 4) {
					continue;
				}
				System.out.println("i: "+ i + " j: "+ j + " k: " + k);
				mtx[4-j][k] = v++;
			}
		}*/
		for(int i=0;i<9;i++) {
			for(int j=4;j>=0;j--) {
				//k = (i-j);//40부터 5시방향
				k = 4-(i-j);//44부터 7시방향 
				if(k < 0 || k > 4) {
					continue;
				}
				System.out.println("i: "+ i + " j: "+ j + " k: " + k);
				mtx[4-j][k] = v++;
			}
		}
		/*int s = 0,l=0;
		for(int i=0;i<9;i++) {
			k = l++;
			if(i>4) {
				k=4;
				s++;
			}
			for(int j=s;j<5;j++) {
				if(k<0) {
					break;
				}else {
					mtx[j][k] = v++;
					k--;
				}
			}
		}*/
		for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                System.out.printf("["+"%d"+"]",mtx[i][j]);
            }
            System.out.printf("\n");
       }
	}
}
