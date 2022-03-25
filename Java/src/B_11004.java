/*
 * A를 오름차순 정렬했을 때, 앞에서부터 K번째 있는 수를 구하는 프로그램
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_11004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] a = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(a); // 오름차순으로 정렬 
		
		// A를 정렬했을 때, 앞에서부터 K번째 있는 수를 출력
		System.out.println(a[k - 1]);
		
	}
}
