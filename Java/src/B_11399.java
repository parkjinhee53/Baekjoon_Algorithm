/*
 * 줄을 서 있는 사람의 수 N과 각 사람이 돈을 인출하는데 걸리는 시간 Pi가 주어졌을 때, 
 * 각 사람이 돈을 인출하는데 필요한 시간의 합의 최솟값을 구하는 프로그램
 */
import java.util.*;

public class B_11399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 사람의 수 
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr); // 오름차순 정렬
		
		int p = 0; // 이전 대기시간 총합 
		int sum = 0; // 대기시간 총합 
		
		for(int i = 0; i < n; i++) {
			p += arr[i];
			sum += p;
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
