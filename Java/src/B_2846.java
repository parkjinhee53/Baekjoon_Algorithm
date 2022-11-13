/*
 * 가장 큰 오르막길을 구하는 프로그램 
 */

import java.util.Scanner;

public class B_2846 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 수열 크기 
		int[] arr = new int[n];
		int sum = 0; // 오르막길 합 
		int max = 0; // 가장 큰 오르막길 
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n-1;i++) {
			if(arr[i] < arr[i+1]) {
				sum += arr[i+1] - arr[i];
			}
			else {
				sum = 0;
			}
			max = Math.max(max, sum);
		}
		System.out.println(max);
	}
}
