/*
 * N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램 
 */
import java.util.Arrays;
import java.util.Scanner;

public class B_1920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(); 
		}
		
		Arrays.sort(arr); // 배열에 저장된 정수 오름차순으로 정렬
		
		int m = sc.nextInt();
		int[] arr1 = new int[m];
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		
		for(int i = 0; i < m; i++) {
			System.out.println(binarySearch(arr, arr1[i]));
		}
		sc.close();
	}
	
	// 이분탐색 
	public static int binarySearch(int[] arr, int key) {
		int low = 0; // 0번 인덱스 
		int mid = 0; // 중간값 
		int high = arr.length-1; // n-1번 인덱스  
		
		while(low <= high) {
			mid = (low + high) / 2;
			
			if(arr[mid] == key) {
				return 1;
			}
			else if(arr[mid] > key) { // 찾고자 하는 값이 중간값보다 낮다면 high를 mid-1
				high = mid - 1;
			}
			else if(arr[mid] < key) { // 찾고자 하는 값이 중간값보다 높다면 low를 mid+1
				low = mid + 1;
			}
		}
		return 0;
	}
}
