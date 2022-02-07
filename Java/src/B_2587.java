/*
 * 다섯 개의 자연수가 주어질 때 이들의 평균과 중앙값을 구하는 프로그램 
 */
import java.util.Scanner;
import java.util.Arrays;

public class B_2587 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int sum = 0; // 평균 
		int m = 0; // 중앙값 
		
		
		for(int i = 0; i < 5; i++) { // 다섯 개의 자연수 입력 
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr); // 배열에 저장된 정수 오름차순으로 정렬
		
		for(int i = 0; i < arr.length; i++) { // 평균, 중앙값 구하기 
			sum += arr[i];
			m = arr[2];
		}
		
		System.out.println(sum / 5); // 평균을 출력 
		System.out.println(m); // 중앙값을 출력
		
		sc.close();
	}
}
