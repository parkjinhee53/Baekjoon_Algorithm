/*
 * 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_2522 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= n-1; i++) {
			for(int j = 1; j<= i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= n - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
