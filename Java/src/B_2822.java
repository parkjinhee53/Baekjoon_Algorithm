/*
 * 참가자의 8개 문제 점수가 주어졌을 때, 총 점수를 구하는 프로그램 
 */
import java.util.Scanner;

public class B_2822 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[8]; // 8개 문제 점수 저장할 배열 
		int[] arr1 = new int[8]; // arr 배열 복사하기 위한 배열 
		int[] result = new int[5]; // 가장 높은 점수 5개 저장할 배열 
		int sum = 0; // 총 점수 
		
		for(int i = 0; i < arr.length; i++) { // 점수 입력 
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 8; i++) { // 복사하기 
			arr1[i] = arr[i];
		}
		
		// 배열에 저장된 정수 내림차순으로 정렬 
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) { 
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		// 참가자의 총 점수(가장 높은 점수 5개의 합)
		for(int i = 0; i < result.length; i++) {
			result[i] += arr[i];
			sum += result[i];
		}
		
		System.out.println(sum); // 총 점수 출력 
		
		for(int i = 0; i < 8; i++) { // 문제 번호 출력 
			for(int j = 0; j < 5; j++) {
				if(arr1[i] == result[j]) {
					System.out.print(i+1 + " ");
				}
			}
		}
		
		sc.close();
	}
}
