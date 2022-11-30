/*
 * 시험문제의 채점 결과가 주어졌을 때, 총 점수를 계산하는 프로그램 
 */
import java.util.Scanner;

public class B_2506 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == 1) {
				count++;
				sum += count;
			}
			else {
				count = 0;
			}
		}
		
		System.out.println(sum);
	}
}
