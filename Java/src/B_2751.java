/*
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class B_2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr); // 배열에 저장된 정수 오름차순으로 정렬 
		
		for(int i : arr) {
			sb.append(i).append('\n');
		}
		
		System.out.println(sb);
	}
}
