/*
 * 칠판에 붙여진 단어들이 주어질 때, 영석이가 세로로 읽은 순서대로 글자들을 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_10798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[][] word = new char[5][15];
		int max = 0;
		
		for(int i = 0; i < 5; i++) {
			String s = sc.next();
			max = Math.max(max, s.length());
			
			for(int j = 0; j < s.length(); j++) {
				word[i][j] = s.charAt(j);
			}
		}
		
		for(int i = 0; i < max; i++) {
			for(int j = 0; j < 5; j++) {
				if(word[j][i] == '\0') {
					continue;
				}
				System.out.print(word[j][i]);
			}
		}
	}
}
