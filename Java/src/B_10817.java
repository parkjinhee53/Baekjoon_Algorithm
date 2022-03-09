/*
 * 세 정수 A, B, C가 주어졌을 때 두 번째로 큰 정수를 출력하는 프로그램 
 */
import java.util.Arrays;
import java.util.Scanner;

public class B_10817 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr); // 배열에 저장된 정수 오름차순으로 정렬 
		
		System.out.println(arr[1]); // 두 번째로 큰 정수를 출력 
		
		sc.close();
	}
}
