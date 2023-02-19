/*
 * S에 포함되어있는 자연수의 합을 구하는 프로그램 
 */
import java.util.Scanner;

public class B_10822 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String[] num = s.split(",");
		int sum = 0;
		
		for(String i: num) {
			int n = Integer.parseInt(i);
			sum += n;
		}
		System.out.println(sum);
	}
}
