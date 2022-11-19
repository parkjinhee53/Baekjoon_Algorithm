/*
 * 4개의 역에 대해 기차에서 내린 사람 수와 탄 사람 수가 주어졌을 때, 기차에 사람이 가장 많을 때의 사람 수를 계산하는 프로그램 
 */
import java.util.Scanner;

public class B_2455 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int now = 0;
		
		for(int i = 0; i < 4; i++) {
			int out = sc.nextInt();
			int in = sc.nextInt();
			
			now -= out;
			now += in;
			max = Math.max(max, now);
		}
		System.out.println(max);
	}
}
