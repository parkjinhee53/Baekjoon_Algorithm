/*
 * 민국이의 총점 S와 만세의 총점 T 중에서 큰 점수를 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_5596 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s = 0; // 민국이의 총점 
		int t = 0; // 만세의 총점 
		
		for(int i = 0; i < 4; i++) { // 민국이의 정보, 수학, 과학, 영어 점수(정수형) 
			int a = sc.nextInt();
			s += a;
		}
		
		for(int i = 0; i < 4; i++) { // 만세의 정보, 수학, 과학, 영어 점수(정수형) 
			int b = sc.nextInt();
			t += b;
		}
		
		if(s > t || s == t) {
			System.out.println(s);
		}
		else {
			System.out.println(t);
		}
		
		sc.close();
	}
}
