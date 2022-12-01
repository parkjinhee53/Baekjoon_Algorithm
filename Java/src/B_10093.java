/*
 * 두 양의 정수가 주어졌을 때, 두 수 사이에 있는 정수를 모두 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_10093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		if(a>b) {
			System.out.println(a-b-1);
			for(long i = b + 1; i < a; i++) {
				System.out.print(i + " ");
			}
		}
		else if(a<b) {
			System.out.println(b-a-1);
			for(long i = a + 1; i < b; i++) {
				System.out.print(i + " ");
			}
		}
		else {
			System.out.println(0);
		}
	}
}
