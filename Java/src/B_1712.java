/*
 * A, B, C가 주어졌을 때, 손익분기점을 구하는 프로그램 
 */
import java.util.Scanner;

public class B_1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // 고정 비용 
		int b = sc.nextInt(); // 가변 비용 
		int c = sc.nextInt(); // 상품 가격 
		
		if(b >= c) { // 손익분기점이 존재하지 않으면 -1을 출력 
			System.out.println(-1);
		}
		else { // 최초로 이익이 발생하는 판매량을 출력 
			System.out.println((a / (c - b)) + 1);
		}
		
		sc.close();
	}
}
