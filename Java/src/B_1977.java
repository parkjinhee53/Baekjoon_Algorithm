/*
 * M과 N이 주어질 때 M이상 N이하의 자연수 중 완전제곱수인 것을 모두 골라 그 합을 구하고 그 중 최솟값을 찾는 프로그램 
 */
import java.util.Scanner;

public class B_1977 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int min = (int)Math.ceil(Math.sqrt(m));
		int sum =0 ;
				
		for(int i = min; i <= Math.floor(Math.sqrt(n)); i++) {
			sum += Math.pow(i, 2);
		}
		
		if(sum > 0) {
			System.out.println(sum);
			System.out.println((int)Math.pow(min, 2));
		}
		else {
			System.out.println(-1);
		}
	}
}
