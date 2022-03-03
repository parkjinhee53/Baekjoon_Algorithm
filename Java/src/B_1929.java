/*
 * M이상 N이하의 소수를 모두 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i = m; i <= n; i++) {
			boolean isPrime = true; // 소수면 true, 아니면 false 

			if(i == 1) { // 1이면 소수가 아님 
				continue;
			}

			for(int j = 2; j <= Math.sqrt(i); j++) { // Math.sqrt()는 제곱근 구하는 함수 
				if(i % j == 0) { 
					isPrime = false; // 나눠떨어지면 소수가 아니므로 false 
					break;
				}
			}

			if(isPrime) { // 소수 
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
