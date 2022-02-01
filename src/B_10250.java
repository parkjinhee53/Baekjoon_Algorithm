/*
 * 호텔 정문으로부터 걷는 거리가 가장 짧도록 방을 배정하는 프로그램
 */
import java.util.Scanner;

public class B_10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();	// 테스트 케이스
		 
		for(int i = 0; i < t; i++) {
			
			int h = sc.nextInt();
			int w = sc.nextInt(); 	// 쓸모없는 변수다.
			int n = sc.nextInt();
			
			if(n % h == 0) {
				System.out.println((h * 100) + (n / h));
 
			} else {
				System.out.println(((n % h) * 100) + ((n / h) + 1));
			}
		}
		sc.close();
	}
}