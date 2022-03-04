/*
 * 두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// reverse() -> 문자열 뒤집기 
		a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
		b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());
		
		if(a > b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
		
		sc.close();
	}

}
