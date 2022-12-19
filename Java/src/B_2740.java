/*
 * N*M크기의 행렬 A와 M*K크기의 행렬 B가 주어졌을 때, 두 행렬을 곱하는 프로그램
 */
import java.util.Scanner;

public class B_2740 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		
		for(int i = 0; i < n; i++) { // a
			for(int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		m = sc.nextInt();
		int k = sc.nextInt();
		int[][] b = new int[m][k];
		
		for(int i = 0; i < m; i++) { // b
			for(int j = 0; j < k; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		int[][] sum = new int[n][k];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < k; j++) {
				for(int K = 0; K < m; K++) {
					sum[i][j] += a[i][K] * b[K][j];
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < k; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}
}
