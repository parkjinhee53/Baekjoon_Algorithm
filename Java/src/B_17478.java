/*
 * JH 교수님이 만들 챗봇의 응답을 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_17478 {
	static String[] s; // 문장 저장할 배열 선언
	static int n; // 재귀 횟수

	// 재귀 함수
	public static void reply(int a) {
		String underbar = "____";
		
		System.out.println(underbar.repeat(n-a) + s[0]);
		
		if(a == 0) { // 종료
			System.out.println(underbar.repeat(n-a) + s[4]);
			System.out.println(underbar.repeat(n-a) + s[5]);
			return; 
		}
		
		// 반복되는 문장
		System.out.println(underbar.repeat(n-a) + s[1]);
		System.out.println(underbar.repeat(n-a) + s[2]);
		System.out.println(underbar.repeat(n-a) + s[3]);
		
		
		reply(a-1);
		System.out.println(underbar.repeat(n-a) + s[5]);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt(); // 재귀 횟수 입력받기
		
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		
		s= new String[6]; // 배열 생성
		s[0] = "\"재귀함수가 뭔가요?\""; // " 출력하려면 \" 써야 함.
		s[1] = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
		s[2] = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
		s[3] = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
		s[4] = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
		s[5] = "라고 답변하였지.";
		
		reply(n); // 재귀 함수 호출
	}
}
