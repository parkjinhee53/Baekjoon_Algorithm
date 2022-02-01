/*
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String a = sc.next();
		int sum = 0 ;
		
		for(int i = 0; i < n; i++) {
			sum += a.charAt(i) - '0'; // charAt는 char 형태 반환
		}
		System.out.println(sum);
		sc.close();
	}
}