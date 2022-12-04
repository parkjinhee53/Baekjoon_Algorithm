/*
 * N(2 ≤ N ≤ 1,000)명이 주사위 게임에 참여하였을 때, 가장 많은 상금을 받은 사람의 상금을 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_2476 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			int sum = 0;
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a == b && b == c) {
				sum = 10000 + (a * 1000);
			}
			else if(a == b || a == c) {
				sum = 1000 + (a * 100);
			}
			else if(b == c) {
				sum = 1000 + (b * 100);
			}
			else {
				int max = Math.max(a, Math.max(b, c));
				sum = max * 100;
			}
			if(sum > result) {
				result = sum;
			}
		}
		System.out.println(result);
	}
}
