/*
 * 정수 N이 주어졌을 때, 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력 
 */
import java.util.Scanner;
import java.lang.Math;

public class B_1463 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int dp[] = new int[n+1]; // 연산을 사용하는 횟수의 최솟값 저장할 배열 
		
		dp[1] = 0; // 초기값 
	       
	       for (int i = 2; i <= n; i++) {
	    	   
	           dp[i] = dp[i-1] + 1;
	           
	           if (i % 2 == 0) { // 2로 나누어 떨어지면 
	        	   dp[i] = Math.min(dp[i], dp[i/2] + 1);
	           }
	           
	           if (i % 3 == 0) { // 3으로 나누어 떨어지면 
	        	   dp[i] = Math.min(dp[i], dp[i/3] + 1);
	           }
	       }
	       System.out.println(dp[n]); // 연산을 사용하는 횟수의 최솟값을 출력 
		
		sc.close();
	}
}
