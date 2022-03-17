/*
 * 알파벳 소문자로만 이루어진 단어가 주어졌을 때, 모음(a, e, i, o, u)의 개수를 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_10987 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int count = 0; // 모음의 개수
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
				count++;
		}
		
		System.out.println(count); // 모음의 개수를 출력 
		
		sc.close();
	}
}
