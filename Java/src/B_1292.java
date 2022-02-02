/*
 * 동호는 내년에 초등학교를 입학한다. 그래서 동호 어머니는 수학 선행 학습을 위해 쉽게 푸는 문제를 동호에게 주었다.
   이 문제는 다음과 같다. 1을 한 번, 2를 두 번, 3을 세 번, 이런 식으로 1 2 2 3 3 3 4 4 4 4 5 .. 
   이러한 수열을 만들고 어느 일정한 구간을 주면 그 구간의 합을 구하는 것이다.
   하지만 동호는 현재 더 어려운 문제를 푸느라 바쁘기에 우리가 동호를 도와주자.
 */
import java.util.Scanner;

public class B_1292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 구간의 시작과 끝을 나타내는 정수 A, B
		int a = sc.nextInt();
		int b = sc.nextInt(); 
		
		int[] arr = new int[b]; // 수열을 담을 배열 
		int count = 0;
		
		for(int i = 1; i <= b; i++) {
			for(int j = 0; j < i; j++) {
				if(count == b) {
					break;
				}
				arr[count] = i;
				count++;
			}
		}
		
		int sum = 0;
		for(int i = a; i <= b; i++) { // 수열에서 A번째 숫자부터 B번째 숫자까지 합을 구하기 
			sum += arr[i-1];
		}
		
		System.out.println(sum);
		sc.close();
	}
}
