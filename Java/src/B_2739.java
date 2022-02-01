/*
 * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_2739 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
		sc.close();
	}
}
