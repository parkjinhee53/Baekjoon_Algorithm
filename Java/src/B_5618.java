/*
 * 자연수 n개가 주어졌을 때 이 자연수의 공약수를 모두 구하는 프로그램
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_5618 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		StringTokenizer s = new StringTokenizer(bf.readLine());
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(s.nextToken());
		}
		Arrays.sort(arr);
		
		for(int i = 1; i <= arr[0]; i++) {
			int count = 0;
			
			for(int j = 0; j < n; j++) {
				if(arr[j] % i == 0) {
					count++;
				}
			}
			if(count == n) {
				System.out.println(i);
			}
		}
	}
}
