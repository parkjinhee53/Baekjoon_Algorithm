/*
 * 정수 N이 주어졌을 때, 소인수분해하는 프로그램
 */
import java.util.Scanner;

public class B_11653 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 2;
		
		while(i <= n) {
			if(n % i == 0) {
				System.out.println(i);
				n /= i;
			}
			else {
				i++;
			}
		}
	}
}
