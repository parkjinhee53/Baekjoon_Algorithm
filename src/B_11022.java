/*
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_11022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("Case #" + i + ": " + a + " + " + b + " = " +(a+b));
		}
		sc.close();
	}
}