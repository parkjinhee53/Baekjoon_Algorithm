/*
 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램 
 */
import java.util.Scanner;

public class B_8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String arr[] = new String[n];
		
		for (int i = 0; i < n; i++) {
			
			int cnt = 0;	
			int sum = 0;	
			arr[i] = sc.next();
			
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') {
					cnt++;
				} 
				else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
		sc.close();
	}
}