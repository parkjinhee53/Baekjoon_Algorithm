/*
 * 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램 
 */
import java.util.Scanner;
import java.lang.Math;

public class B_1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(); // x 입력받기
		int y = sc.nextInt(); // y 입력받기
		int w = sc.nextInt(); // w 입력받기
		int h = sc.nextInt(); // h 입력받기
		
		int r1 = Math.min(x, w-x); // x, w-x 중 최솟값 구하기
		int r2 = Math.min(y, h-y); // y, h-y 중 최솟값 구하기
		
		System.out.println(Math.min(r1, r2)); // 직사각형의 경계선까지 가는 거리의 최솟값 출력
		sc.close(); // sc 객체 종료
	}
}
