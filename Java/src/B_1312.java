/*
 * 두 수를 나누었을 때, 소숫점 아래 N번째 자리수를 구하는 프로그램 
 */
import java.util.Scanner;

public class B_1312 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		
		int r = a % b;
		
		for(int i = 0; i < n -1; i++) {
			r *= 10;
			r %= b;
		}
		r *= 10;
		
		System.out.print(r/b); // A÷B를 했을 때, 소숫점 아래 N번째 수를 출력 
		
		sc.close();
	}
}
