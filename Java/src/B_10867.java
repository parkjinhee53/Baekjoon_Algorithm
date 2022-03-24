/*
 * N개의 정수를 중복 제거하고 오름차순으로 정렬하는 프로그램
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class B_10867 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length; i++) { // N개의 정수 입력받기 
			arr[i] = sc.nextInt();
		}
		
		for(int i : arr) { // 중복 제거 
			if(!arr2.contains(i)) {
				arr2.add(i);
			}
		}
		
		arr2.sort(Comparator.naturalOrder()); // 오름차순으로 정렬 
		
		for(int i : arr2) { // 오름차순으로 정렬한 결과를 출력 
			System.out.print(i + " ");
		}
		
		sc.close();
	}
}
