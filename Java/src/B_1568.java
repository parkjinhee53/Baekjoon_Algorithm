/*
 * 나무에 앉아 있는 새의 수 N이 주어질 때, 하나의 수를 노래하는데 1초가 걸린다고 하면, 
 * 모든 새가 날아가기까지 총 몇 초가 걸리는지 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_1568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int bird = 1;
		int count = 0;
		
		while(n != 0) {
			if(bird > n) {
				bird = 1;
			}
			n -= bird;
			count += 1;
			bird += 1;
		}
		
		System.out.println(count);
	}

}
