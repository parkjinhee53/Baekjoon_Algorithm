/*
 * n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램 
 */
import java.util.*;
import java.math.BigInteger;

public class B_10826 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		BigInteger[] dp = new BigInteger[n+2];
		
		dp[0] = new BigInteger("0");
		dp[1] = new BigInteger("1");
		
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i-2].add(dp[i-1]);
		}
		System.out.println(dp[n]);
	}
}
