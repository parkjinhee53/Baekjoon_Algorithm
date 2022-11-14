/*
 * 버튼을 K번 눌렀을 때, 화면에 A와 B의 개수는 몇 개인지 구하는 프로그램 
 */
import java.util.Scanner;

public class B_9625 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int a = 0;
		int b = 1;
		
		for(int i = 1; i < k; i++) {
			int sum = a + b;
			a = b;
			b = sum;
		}
		System.out.println(a + " " + b);
	}

}
