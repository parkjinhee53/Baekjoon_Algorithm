/*
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램 
 */
import java.util.Scanner;
import java.util.Arrays;

public class B_10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 정수의 개수 N
		int[] arr = new int[n]; // 정수 담을 배열 
		
		for(int i = 0; i < n; i++) { // N개의 정수 입력 
			arr[i] = sc.nextInt(); 
		}
		
		Arrays.sort(arr); // 배열에 저장된 정수 오름차순으로 정렬 
		
		System.out.println(arr[0] + " " + arr[n - 1]); // 최솟값과 최댓값 출력 
		
		sc.close();
	}
}
