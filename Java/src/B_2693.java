/*
 * 배열 A가 주어졌을 때, N번째 큰 값을 출력하는 프로그램 (N은 항상 3) 
 */
import java.util.Arrays;
import java.util.Scanner;

public class B_2693 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(); // 테스트 케이스의 개수
		int[] a = new int[10];
		
		for(int i = 0; i < t; i++) { // 배열 A의 원소 입력받기 
			for(int j = 0; j < 10; j++) {
				a[j] = sc.nextInt();
			}
			Arrays.sort(a); // 오름차순으로 정렬 
			System.out.println(a[7]); // 3번째 큰 값을 출력
		}
		sc.close();
	}
}
