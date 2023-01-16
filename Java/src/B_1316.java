/*
 * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			boolean[] arr = new boolean[26];
			boolean result = true;
			
			for(int j = 0; j < s.length(); j++) {
				int c = s.charAt(j) - 'a';
				if(arr[c]) { // 전에 사용한 적 있는지 
					if(s.charAt(j) != s.charAt(j - 1)) { // 이전 문자와 연속되지 않는다면 
						result = false;
						break;
					}
				}
				else {
					arr[c] = true;
				}
			}
			if(result) {
				count++;
			}
		}
		System.out.println(count);
	}
}
