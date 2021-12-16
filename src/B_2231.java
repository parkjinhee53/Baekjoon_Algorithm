/*
 * 자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램 
 */
import java.util.Scanner;

public class B_2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;

		for(int i = 0; i < n; i++) {
			int number = i;
			int sum = 0;	// 각 자릿수 합 변수 

			while(number != 0) {
				sum += number % 10;	// 각 자릿수 더하기
				number /= 10;
			}

			// i 값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 경우) 
			if(sum + i == n) {
				result = i;
				break;
			}

		}
		System.out.println(result);
		sc.close();
	}
}