/*
 * 고유번호의 처음 5자리의 숫자들이 주어지고 검증수를 구하는 프로그램 
 */
import java.util.Scanner;
public class B_2475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			sum += n * n;
		}
		
		System.out.println(sum % 10); // 검증수를 출력 
		
		sc.close();
	}
}
