/*
 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램 
 */
import java.util.Scanner; // Scanner 사용하기 위해 import문 사용

public class B_2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 클래스로 입력받기
		int i; // 반복문에 사용할 변수
		int j; // 반복문에 사용할 변수
		int k; // 반복문에 사용할 변수
		
		int t = sc.nextInt();
		
		for(i=0; i<t; i++) { // 테스트 케이스의 개수만큼 반복
			int a = sc.nextInt(); // 반복 횟수 입력받기
			String b = sc.next(); // 문자열 입력받기
			String p =""; // 새 문자열 저장
			for(j=0; j<b.length(); j++) { // 문자열 길이만큼 반복
				for(k=0; k<a; k++) { // a만큼 반복
					p += b.charAt(j); // charAt() 함수를 이용
				}
			}
			System.out.println(p); // 새 문자열 출력	
		}
	}
}