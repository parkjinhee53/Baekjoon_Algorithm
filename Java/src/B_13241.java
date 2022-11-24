/*
 * 두 수에 대하여 최소공배수를 구하는 프로그램 
 */
import java.util.Scanner;

public class B_13241 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		
		long result = a * b / gcd(a, b);
		
		System.out.println(result);
	}
	
	public static long gcd(long a, long b) {
		while(b != 0) {
			long r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
