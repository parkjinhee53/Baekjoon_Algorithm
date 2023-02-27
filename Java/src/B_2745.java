/*
 * B진법 수 N이 주어졌을 때, 이 수를 10진법으로 바꿔 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_2745 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int n = sc.nextInt();
		int result = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if('0' <= s.charAt(i) && '9'>= s.charAt(i)) {
				result = result * n + (s.charAt(i) - '0');
			}
			else {
				result = result * n + (s.charAt(i) - 'A' + 10);
			}
		}
		System.out.println(result);
	}
}
