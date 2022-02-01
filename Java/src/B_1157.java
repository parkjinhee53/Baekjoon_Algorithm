/*
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램 
 */
import java.util.Scanner;

public class B_1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[26]; // 알파벳 카운트 저장할 배열
		String s = sc.nextLine().toUpperCase();
		int max = 0; // 가장 많이 나온 알파벳 수 저장
		char c = '?'; // 정답 저장
		
		for(int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)-65]++; // 현재 알파벳을 알파벳 카운트 배열에 +1 해줌
			if(max < arr[s.charAt(i)-65]) { // 현재 알파벳 수가 max보다 크다면
				max = arr[s.charAt(i)-65]; // max 변수에 현재 알파벳 수 저장
				c = s.charAt(i); // 정답에 현재 알파벳 저장
			}
			else if(max == arr[s.charAt(i)-65]) { // 현재 알파벳 수가 max와 같다면 
				c = '?';
			}
		}
		System.out.println(c);
		sc.close();
	}
}
