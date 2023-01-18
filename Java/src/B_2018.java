/*
 * N을 입력받아 가지수를 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_2018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 0; 
		
		int start = 1;
		int end = 1;
		int sum = 1;
		
		while(start <= end) {
			if(sum == n) {
				count++;
			}
			if(sum < n) {
				end++;
				sum += end;
			}
			else if(sum >= n) {
				sum -= start;
				start++;
			}
		}
		System.out.println(count);
	}
}
