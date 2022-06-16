/*
 * 두 배열을 합친 다음 정렬해서 출력하는 프로그램
 */
import java.util.*;
import java.io.*;

public class B_11728 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // 배열 a의 크기 
		int m = Integer.parseInt(st.nextToken());; // 베열 b의 크기 
		
		int[] a = new int[n];
		int[] b = new int[m];
		int[] result = new int[n+m];
		
		// 배열 a, b 값 넣기 
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}

		// 배열 a, b 정렬하기 
		Arrays.sort(a);
		Arrays.sort(b);
		
		// 두 배열 합치기 
		for(int i = 0; i < n; i++) {
			result[i] = a[i];
		}
		for(int i = n; i < n + m; i++) {
			result[i] = b[i - n];
		}
		
		// 합친 배열 result 정렬하기 
		Arrays.sort(result);
		
		for(int i : result) {
			bw.write(i + " ");
		}
		
		bw.flush();
		bw.close();
	}
}
