/*
 * 여학생의 수 N, 남학생의 수 M, 인턴쉽에 참여해야하는 인원 K가 주어질 때 만들 수 있는 최대의 팀 수를 구하는 프로그램 
 */
import java.util.Scanner;

public class B_2875 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		
		while(n >= 2 && m >= 1 && n+m >= 3 + k) {
			n = n - 2;
			m = m - 1;
			count++;
		}
		
		System.out.println(count);
	}

}
