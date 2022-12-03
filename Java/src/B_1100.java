/*
 * 체스판의 상태가 주어졌을 때, 하얀 칸 위에 말이 몇 개 있는지 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_1100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		for(int i = 0; i < 8; i++) {
			String s = sc.next();
			for(int j = 0; j < 8; j++) {
				if((i + j) % 2 == 0 && s.charAt(j) == 'F') {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
