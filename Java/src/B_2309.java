/*
 * 아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램 
 */
import java.util.Scanner;
import java.util.Arrays;

public class B_2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int sum = 0;
		int a = 0;
		int b = 0;
		
		for(int i = 0; i < 9; i++) { // 키 입력 
			arr[i] = sc.nextInt();
			sum += arr[i]; // 9명 난쟁이 키의 합 
		}
		
		Arrays.sort(arr); // 배열에 저장된 정수 오름차순으로 정렬
		
		for (int i = 0; i < arr.length; i++) { // 9명 중 키의 합이 100이 넘는 2명을 고르기 위한 반복문 
			for (int j = i + 1; j < arr.length; j++) {
				if (sum - arr[i] - arr[j] == 100) { // 키의 합에서 2명 뺐을 100이면 
					a = i;
					b = j;
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) { // 7명 난쟁이 출력하기 위한 반복문 
			if(i == a || i == b) {
				continue;
			}
			System.out.println(arr[i]);
		}
		
		sc.close();
	}
}
