/*
 * 두 정수 N과 F가 주어졌을 때, 뒤 두 자리를 가능하면 작게 만드는 프로그램 
 */
import java.util.Scanner;

public class B_1075 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int f = sc.nextInt();
		
		int a = (n/100) * 100;
		
		while(true) {
			if(a % f == 0) {
				int result = a % 100;
				if(result < 10) {
					System.out.println("0" + result);
				}
				else {
					System.out.println(result);
				}
				break;
			}
			a++;
		}
	}
}
