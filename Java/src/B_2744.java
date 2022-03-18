/*
 * 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_2744 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		char[] arr = s.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			if(65 <= arr[i] && arr[i] <= 90) { // 대문자 
				arr[i] = (char)(arr[i] + 32); // 소문자로 바꾸기 
				continue;
			}
			if(97 <= arr[i] && arr[i] <= 122) { // 소문자 
				arr[i] = (char)(arr[i] - 32); // 대문자로 바꾸기 
				continue;
			}
		}
		
		System.out.println(arr);
		
		sc.close();
	}
}
