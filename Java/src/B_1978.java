/*
 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 수의 개수 
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			boolean isPrime = true; // 소수면 true, 아니면 false 
			
			if(num == 1) { // 1이면 소수가 아님 
				continue;
			}
			
			for(int j = 2; j <= Math.sqrt(num); j++) { // Math.sqrt()는 제곱근 구하는 함수 
				if(num % j == 0) { 
					isPrime = false; // 나눠떨어지면 소수가 아니므로 false 
					break;
				}
			}
			
			if(isPrime) { // 소수면 1씩 증가 
				count++;
			}
		}
		
		System.out.println(count); // 소수의 개수를 출력 
		
		sc.close();
	}
}
