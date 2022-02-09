/*
 * 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램 
 */
import java.util.Scanner;
import java.util.Arrays;

public class B_1037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // N의 진짜 약수의 개수 
		int[] arr= new int[n];
		int max = 0; // 최대 
		int min = 0; // 최소 
		
		for(int i = 0; i < arr.length; i++) { // N의 진짜 약수 입력 
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr); // 배열에 저장된 정수 오름차순으로 정렬
		
		max = arr[n-1]; // 인덱스가 0부터 시작하기 때문에 n-1임 
		min = arr[0];
		
		System.out.println(max*min); // 최댓값과 최솟값을 곱하면 그 값이 N
		
		sc.close();
	}
}
