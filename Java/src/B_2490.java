/*
 * 네 개 윷짝을 던져서 나온 각 윷짝의 배 혹은 등 정보가 주어질 때 도(배 한 개, 등 세 개), 개(배 두 개, 등 두 개), 
 * 걸(배 세 개, 등 한 개), 윷(배 네 개), 모(등 네 개) 중 어떤 것인지를 결정하는 프로그램
 */
import java.util.Scanner;

public class B_2490 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			int cnt = 0;
			
			for(int j = 0; j < 4; j++) {
				int n = sc.nextInt();
				
				if(n == 0) { // 0이면 배이므로 배의 개수 카운트 
					cnt++;
				}
				
			}
			
			if(cnt == 0) { // 모 
				System.out.println("E");
			}
			else if(cnt == 1) { // 도 
				System.out.println("A");
			}
			else if(cnt == 2) { // 개 
				System.out.println("B");
			}
			else if(cnt == 3) { // 걸 
				System.out.println("C");
			}
			else if(cnt == 4) { // 윷 
				System.out.println("D");
			}
		}
		
		sc.close();
	}
}
