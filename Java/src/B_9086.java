/*
 * 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_9086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 테스트 케이스의 개수 
		
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			
			// 문자열의 첫 글자와 마지막 글자를 연속하여 출력 
			System.out.println(s.charAt(0) + "" + s.charAt(s.length()-1));
		}
		sc.close();
	}
}
