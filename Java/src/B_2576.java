/*
 * 7개의 자연수가 주어질 때, 이들 중 홀수인 자연수들을 모두 골라 그 합을 구하고, 고른 홀수들 중 최솟값을 찾는 프로그램 
 */
import java.util.Scanner;

public class B_2576 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0; // 홀수들의 합 
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < 7; i++) {
			int n = sc.nextInt();
			if(n % 2 == 1) { // 홀수 
				sum += n;
				if(min > n) {
					min = n;
				}
			}
		}
		
		// 홀수가 존재하지 않는 경우에는 첫째 줄에 -1을 출력 
		if(sum == 0) {
			System.out.println(-1);
			return;
		}

		System.out.println(sum); // 홀수들의 합을 출력 
		System.out.println(min); // 홀수들 중 최솟값을 출력 
		
		sc.close();
	}
}
