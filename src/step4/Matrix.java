package step4;

import javax.swing.JOptionPane;

enum Butt {
	EXIT, LEFT_TRIANGLE, RIGHT_TRIANGLE, ZIGZAG, DIAMOND, SAND_GLASS, TRIANGLE, DIAGONAL, SNAIL, MAGIC_SQUARE, MATRIX_CONVERSION;
}

public class Matrix {
	public static String LeftTriangle() {
		String result = "";
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
				result += "[" + mtx[i][j] + "]";
			}
			result += "\n";
		}
		return result;
	}

	public static String RightTriangle() {
		String result = "";
		int k = 0;
		int v = 4;
		int[][] mtx = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = v; j < 5; j++) {
				mtx[i][j] = ++k;
			}
			v--;
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += "[" + mtx[i][j] + "]";
			}
			result += "\n";
		}
		return result;
	}

	public static String Zigzag() {
		String result = "";
		int k = 0;
		int s = 0, e = 4;
		int[][] mtx = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = s; j != e;) {
				if (i % 2 == 0) {
					s = 4;
					e = 5;
					mtx[i][j] = ++k;
					j++;
				} else {
					s = 0;
					e = -1;
					mtx[i][j] = ++k;
					j--;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += "[" + mtx[i][j] + "]";
			}
			result += "\n";
		}
		return result;
	}

	public static String Diamond() {
		String result = "";
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
				result += "[" + mtx[i][j] + "]";
			}
			result += "\n";
		}
		return result;
	}

	public static String SandGlass() {
		String result = "";
		int k = 0;
		int s = -1, e = 5;
		int[][] mtx = new int[5][5];
		for (int i = 0; i < 5; i++) {
			if (i <= 2) {
				s++;
				e--;
			} else {
				s--;
				e++;
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
				result += "[" + mtx[i][j] + "]";
			}
			result += "\n";
		}
		return result;
	}

	public static String Triangle() {
		String result = "";
		int k = 0;
		int s = 4, e = 4, count = 0;
		int r = 3, c = 0;
		int[][] mtx = new int[7][4];
		/*
		 * for (int j = 0; j < 4; j++) {//이중for-loop 사용한 경우 s=3-j; e=j+3; for (int i =
		 * s; i <= e; i++) { mtx[i][j] = ++k; } }
		 */
		int n = 1;
		for (int i = 1; i <= 16; i++) {// for-loop 하나만 사용한 경우
			mtx[r][c] = ++k;
			r++;
			if (i == n * n) {
				r = 3 - n;
				c++;
				n++;
			}
		}
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++) {
				result += "[" + mtx[i][j] + "]";
			}
			result += "\n";
		}
		return result;
	}

	public static String Digonal() {
		String result = "";
		int k = -1, r = 0, c = 0, v = 1;
		int[][] mtx = new int[5][5];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j <= 4; j++) {
				k = i - j; // 00부터 7시방향
				// k = 4-(i-j);//04부터 5시방향
				if (k < 0 || k > 4) {
					continue;
				}
				mtx[j][k] = v++;
			}
		}
		/*
		 * for(int i=0;i<9;i++) { for(int j=4;j>=0;j--) { k = i-j; //00부터 1시방향 //k =
		 * 4-(i-j);//40부터 11시방향 if(k < 0 || k > 4) { continue; } mtx[j][k] = v++; } }
		 */
		/*
		 * for(int i=0;i<9;i++) { for(int j=0;j<=4;j++) { k = (i-j);//40부터 11시방향 //k =
		 * 4-(i-j);//44부터 1시방향 if(k < 0 || k > 4) { continue; }
		 * System.out.println("i: "+ i + " j: "+ j + " k: " + k); mtx[4-j][k] = v++; } }
		 */
		/*
		 * for(int i=0;i<9;i++) { for(int j=4;j>=0;j--) { k = (i-j);//40부터 5시방향 //k =
		 * 4-(i-j);//44부터 7시방향 if(k < 0 || k > 4) { continue; }
		 * System.out.println("i: "+ i + " j: "+ j + " k: " + k); mtx[4-j][k] = v++; } }
		 */
		/*
		 * int s = 0,l=0; for(int i=0;i<9;i++) { k = l++; if(i>4) { k=4; s++; } for(int
		 * j=s;j<5;j++) { if(k<0) { break; }else { mtx[j][k] = v++; k--; } } }
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += "[" + mtx[i][j] + "]";
			}
			result += "\n";
		}
		return result;
	}

	public static String MatrixConversion() {
		String result = "";
		int[][] mtx1 = new int[5][3];
		int[][] mtx2 = new int[3][5];
		int k = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				mtx1[i][j] = ++k;
				result += "[" + mtx1[i][j] + "]";
			}
			result += "\n";
		}
		result += "\n=>\n\n";
		int r1 = 0, c1 = 0, r2 = 0, c2 = 0;
		for (int i = 0; i < 15; i++) {
			mtx2[r2][c2++] = mtx1[r1][c1++];
			if (c2 == 5) {
				r2++;
				c2 = 0;
			}
			if (c1 == 3) {
				r1++;
				c1 = 0;
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				result += "[" + mtx2[i][j] + "]";
			}
			result += "\n";
		}
		return result;
	}

	public static String Snail() {
		String result = "";
		int k = 0;
		int x = 0, y = -1, option = 1, count = 4;
		int[][] mtx = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= count; j++) {
				y += option;
				mtx[x][y] = ++k;
			}
			count--;
			for (int j = 0; j <= count; j++) {
				x += option;
				mtx[x][y] = ++k;
			}
			option *= -1;
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += "[" + mtx[i][j] + "]";
			}
			result += "\n";
		}
		return result;
	}

	public static String MagicSquare() {
		String result = "";
		int r = 0, c = 2, n_r = 0, n_c = 0;
		int[][] mtx = new int[5][5];
		for (int i = 1; i <= 25; i++) {
			mtx[r][c] = i;
			n_r = r - 1;
			n_c = c + 1;
			if (n_r < 0) {
				n_r = 4;
			}
			if (n_c > 4) {
				n_c = 0;
			}
			if (mtx[n_r][n_c] == 0) {
				r = n_r;
				c = n_c;
			} else {
				r++;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += "[" + mtx[i][j] + "]";
			}
			result += "\n";
		}
		return result;
	}

	public static void main(String[] args) {
		Butt[] buttons = { Butt.EXIT, Butt.LEFT_TRIANGLE, Butt.RIGHT_TRIANGLE, Butt.ZIGZAG, Butt.DIAMOND,
				Butt.SAND_GLASS, Butt.TRIANGLE, Butt.DIAGONAL, Butt.SNAIL, Butt.MAGIC_SQUARE, Butt.MATRIX_CONVERSION };
		while (true) {
			Butt select = (Butt) JOptionPane.showInputDialog(null,//frame
					"MATRIX PAGE",//frame title
					"SELECT MATRIX MENU",//order
					JOptionPane.QUESTION_MESSAGE,//type
					null,//icon
					buttons,//Array of choices
					buttons[1]//default
					);
			switch(select) {
			case EXIT:return;
			case LEFT_TRIANGLE:JOptionPane.showMessageDialog(null, LeftTriangle());break;
			case RIGHT_TRIANGLE:JOptionPane.showMessageDialog(null, RightTriangle());break;
			case ZIGZAG:JOptionPane.showMessageDialog(null, Zigzag());break;
			case DIAMOND:JOptionPane.showMessageDialog(null, Diamond());break;
			case SAND_GLASS:JOptionPane.showMessageDialog(null, SandGlass());break;
			case TRIANGLE:JOptionPane.showMessageDialog(null, Triangle());break;
			case DIAGONAL:JOptionPane.showMessageDialog(null, Digonal());break;
			case SNAIL:JOptionPane.showMessageDialog(null, Snail());break;
			case MAGIC_SQUARE:JOptionPane.showMessageDialog(null, MagicSquare());break;
			case MATRIX_CONVERSION:JOptionPane.showMessageDialog(null, MatrixConversion());break;
			default:break;
			}
			/*String menu = "0.Stop\n" + "1.LeftTriangle\n" + "2.RightTriangle\n" + "3.Zigzag\n" + "4.Diamond\n"
					+ "5.SandGlass\n" + "6.Triangle\n" + "7.Digonal\n" + "8.MatrixConversion\n" + "9.Snail\n"
					+ "10.MagicSquare\n";
			switch (JOptionPane.showInputDialog(menu)) {
			case "0":
				return;
			case "1":
				JOptionPane.showMessageDialog(null, LeftTriangle());
				break;
			case "2":
				JOptionPane.showMessageDialog(null, RightTriangle());
				break;
			case "3":
				JOptionPane.showMessageDialog(null, Zigzag());
				break;
			case "4":
				JOptionPane.showMessageDialog(null, Diamond());
				break;
			case "5":
				JOptionPane.showMessageDialog(null, SandGlass());
				break;
			case "6":
				JOptionPane.showMessageDialog(null, Triangle());
				break;
			case "7":
				JOptionPane.showMessageDialog(null, Digonal());
				break;
			case "8":
				JOptionPane.showMessageDialog(null, MatrixConversion());
				break;
			case "9":
				JOptionPane.showMessageDialog(null, Snail());
				break;
			case "10":
				JOptionPane.showMessageDialog(null, MagicSquare());
				break;
			default:
				break;
			}*/
		}
	}
}
