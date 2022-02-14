/*
 * S의 최솟값을 출력하는 프로그램 
 */
import java.util.Arrays;
import java.util.Scanner;

public class B_1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int sum = 0;
		
		for(int i  = 0; i < n; i++) { // 배열 a 수 입력 
			a[i] = sc.nextInt();
		}
		
		for(int i  = 0; i < n; i++) { // 배열 b 수 입력 
			b[i] = sc.nextInt();
		}
		
		Arrays.sort(a); // 배열 a 오름차순으로 정렬 
		Arrays.sort(b); // 배열 b 오름차순으로 정렬 
		
		for(int i = 0; i < n; i++) { // S의 최솟값 
			sum += a[i] * b[n-i-1];
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
