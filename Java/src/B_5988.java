/*
 * N개의 정수가 주어지면 홀수인지 짝수인지를 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_5988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		if (n != 0) {
			for (int i = 0; i < n; i++) {
				String[] arr = sc.next().split("");
				System.out.println(Integer.parseInt(arr[arr.length - 1]) % 2 == 0 ? "even" : "odd");
			}
		}
	}
}
