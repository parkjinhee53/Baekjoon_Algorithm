/*
 * N으로 나누었을 때 나머지와 몫이 같은 모든 자연수의 합을 구하는 프로그램 
 */

import java.util.Scanner;

public class B_1834 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long sum = 0;

		for (int i = 0; i < num; i++) {
			sum += (num + 1) * i;
		}
		System.out.println(sum);
	}
}