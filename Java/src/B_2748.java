/*
 * n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램 
 */
import java.util.Scanner;

public class B_2748 {
	
	static int n;
	static long arr[] = new long[91];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		arr[0] = 0; // 0번째 피보나치 수는 0 
		arr[1] = 1; // 1번째 피보나치 수는 1
		
		for(int i = 2; i <= n; i++) {
			arr[i] = arr[i-1] + arr[i-2]; // 2번째부터는 바로 앞 두 피보나치 수의 합 
		}
		
		System.out.println(arr[n]); // n번째 피보나치 수를 출력 
		
		sc.close();
	}
}
