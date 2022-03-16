/*
 * 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램 
 */
import java.util.Scanner;

public class B_10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 정수의 개수 
		int[] arr = new int[n];
		int count = 0; // 정수 v의 개수 
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		
		for(int i = 0; i < arr.length; i++) { // v가 몇 개인지 확인 
			if(arr[i] == v) {
				count++;
			}
		}
		
		System.out.println(count); // v가 몇 개인지 출력 
		
		sc.close();
	}
}
