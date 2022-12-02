/*
 * 두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램 
 */
import java.util.Scanner;

public class B_1934 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a * b / gcd(a,b));
		}
	}
	
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		else {
			return(gcd(b, a % b));
		}
	}
}
