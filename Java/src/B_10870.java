/*
 * n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램 
 */
import java.util.Scanner;

public class B_10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		System.out.println(fibonacci(n));
		
		sc.close();
	}
	
	public static int fibonacci(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}

}
