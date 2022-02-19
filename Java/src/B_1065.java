/*
 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_1065 {
	public static int count(int num) { // 등차수열 개수 구하는 메소드 
		if(num < 100) { // 100보다 작으면 등차수열임 
			return num;
		}
		else {
			
			int cnt = 99; // 한수의 개수 
			
			if(num == 1000) {
				num = 999;
			}
			
			for(int i = 100; i <= num; i++) {
				int a = i / 100; // 백의 자리 
				int b = (i / 10) % 10; // 십의 자리 
				int c = i % 10; // 일의 자리 
				
				if((a - b) == (b - c)) { // 이 조건이면 등차수열임 
					cnt++;
				}
			}
			return cnt;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(count(n));
		
		sc.close();
	}
}
