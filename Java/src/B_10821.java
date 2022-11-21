/*
 * S에 포함되어있는 정수의 개수를 구하는 프로그램 
 */
import java.util.Scanner;

public class B_10821 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		char[] arr = new char[s.length()];
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
		}
		
		for(int i = 0; i < s.length(); i++) {
			if(arr[i] == ',') {
				count++;
			}
		}
		System.out.println(count+1);
	}
}
