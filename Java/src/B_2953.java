/*
 * 각 참가자가 얻은 평가 점수가 주어졌을 때, 우승자와 그의 점수를 구하는 프로그램 
 */
import java.util.Scanner;

public class B_2953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = 0;
		int num = 0;
		
		for(int i = 0; i < 5; i++) {
			int sum = 0;
			
			for(int j = 0; j < 4; j++) {
				int score = sc.nextInt();
				sum += score;
				
				if(sum > max) {
					max = sum;
					num = i + 1;
				}
			}
		}
		System.out.println(num + " " + max);
	}
}
