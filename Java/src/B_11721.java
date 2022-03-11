/*
 * 한 줄에 10글자씩 끊어서 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_11721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		for(int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
			
			if(i % 10 == 9) {
				System.out.println();
			}
		}
		
		sc.close();
	}
}
