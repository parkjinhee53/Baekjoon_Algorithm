/*
 * 영문 문장을 입력받아 모음의 개수를 세는 프로그램 
 */
import java.util.Scanner;

public class B_1264 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String s = sc.nextLine();
			
			if(s.equals("#")) {
				break;
			}
			
			char[] vowels = {'A','E','I','O','U','a','e','i','o','u'};
			
			int count = 0;
			
			for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                
                for (int j = 0; j < vowels.length; j++) {
                    if(c == vowels[j]) {
                        count++;
                    }
                }
            }

            System.out.println(count);
		}
	}
}
