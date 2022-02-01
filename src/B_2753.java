/*
 * 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_2753 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int y = sc.nextInt();
		
		if(y%4==0) {
			if(y%400==0) {
				System.out.println("1");
			}
			else if(y%100==0) {
				System.out.println("0");
			}
			else {
				System.out.println("1");
			}
		}
		else {
			System.out.println("0");
		}
		sc.close();
	}
}
