/*
 * 숫자 세 개가 주어졌을 때, 가장 작은 수, 그 다음 수, 가장 큰 수를 출력하는 프로그램 
 */
import java.util.Arrays;
import java.util.Scanner;

public class B_2752 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr); // 배열에 저장된 정수 오름차순으로 정렬 
		
		for(int i = 0; i < 3; i++){
            System.out.print(arr[i] + " ");
        }
	}
}
