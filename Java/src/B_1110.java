/*
 * N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램 
 */
import java.util.Scanner;

public class B_1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = n / 10; // 입력받은 정수를 10으로 나눈 몫 
		int b = n % 10; // 입력받은 정수를 10으로 나눈 나머지 
		int temp = 0; // 새로운 수
		int count = 0; // 사이클 길이 
		
		while(true) {
			temp = ((a + b) % 10) + (b * 10);
			a = temp / 10; // 새로운 수를 10으로 나눈 몫
			b = temp % 10; // 새로운 수를 10으로 나눈 나머지
			count++; // 사이클 길이 추가하기
			if(n == temp) {  // 입력받은 n이 새로운 수랑 같다면 
				break; 
			}
		}
		System.out.println(count); // 사이클 길이 출력
		
		sc.close();
	}
}
