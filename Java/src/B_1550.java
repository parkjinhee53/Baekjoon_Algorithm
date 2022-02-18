/*
 * 16진수 수를 입력받아서 10진수로 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_1550 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		System.out.println(Integer.parseInt(s, 16)); // 16진수 수를 10진수로 변환해 출력 
		
		sc.close();
	}
}
