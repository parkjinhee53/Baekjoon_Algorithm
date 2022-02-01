/*
 * 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분 
 */
import java.util.Scanner; 
public class B_4153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		while(true) { // 무한반복
			int a = sc.nextInt(); // a 입력받기
			int b = sc.nextInt(); // b 입력받기
			int c= sc.nextInt(); // c 입력받기
			
			if (a == 0 && b == 0 && c == 0) {// a, b, c가 0이면
				break; // 반복문 나가기
			}
			// 피타고라스의 정리가 a*a + b*b = c*c이기 때문에 이 조건에 해당하면 right 출력, 아니면 wrong 출력
			if (a*a + b*b == c*c) { 
				System.out.println("right");
			}
			else if (b*b + c*c == a*a) {
				System.out.println("right");
			}
			else if (a*a + c*c == b*b) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
		}
		sc.close(); 
	}
}