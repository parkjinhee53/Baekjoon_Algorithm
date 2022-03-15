/*
 * 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_2743 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(sc.next().length()); // 단어 입력받고 길이 출력
		
		sc.close();
	}
}
