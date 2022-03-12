/*
 * 두 수가 주어졌을 때, 어떤 관계인지 구하는 프로그램 
 */
import java.util.Scanner;

public class B_5086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if(a == 0 && b == 0) 
				break;

			if(b % a == 0) { // 약수 
				System.out.println("factor");
			}
			else if(a % b == 0) { // 배수 
				System.out.println("multiple");
			}
			else {
				System.out.println("neither");
			}
		}
		
		sc.close();
	}

}
