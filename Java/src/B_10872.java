/*
 * N!을 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(factorial(n));
		
		sc.close();
	}
	
	// 재귀 
	static int factorial(int n) {
		if(n <= 1) {
			return 1;
		}
		return n * factorial(n-1);
	}

}
