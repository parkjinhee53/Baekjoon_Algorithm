/*
 * 주어진 수가 팰린드롬수면 'yes', 아니면 'no'를 출력하는 프로그램 
 */

import java.util.Scanner;

public class B_1259 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String s = sc.next();
			boolean check = true;
			
			if(s.equals("0")) {
				break;
			}
			
			for(int i = 0; i < s.length()/2; i++) {
				if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
					check = false;
				}
			}
			
			if(check) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
	}
}
