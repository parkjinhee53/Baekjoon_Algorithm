/*
 * 두 양의 정수 X와 Y가 주어졌을 때, Rev(Rev(X) + Rev(Y))를 구하는 프로그램 
 */
import java.util.Scanner;

public class B_1357 {
	private static int Rev(int n) {
		int num = 0;
		
		while(n > 0) {
			num = num * 10 + n % 10;
			n /= 10;
		}
		return num;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int x1 = Rev(x);
		int y1 = Rev(y);
		
		int result = Rev(x1 + y1);
		
		System.out.println(result);
		
		sc.close();
	}
}
