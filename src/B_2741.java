/*
 * 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_2741 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
        
		for(int i = 1; i<= n; i++) {
			System.out.println(i);
		}
		sc.close();
	}
}