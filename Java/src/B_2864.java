/*
 * 두 수 A와 B가 주어졌을 때 상근이가 구할 수 있는 두 수의 가능한 합 중, 최솟값과 최댓값을 구해 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_2864 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next().replace('6', '5');
		String b = sc.next().replace('6', '5');

		System.out.print(Integer.parseInt(a) + Integer.parseInt(b) + " "); // 최솟값
		
		a = a.replace('5', '6');
		b = b.replace('5', '6');
		
		System.out.print(Integer.parseInt(a) + Integer.parseInt(b)); // 최댓값 
	}

}
