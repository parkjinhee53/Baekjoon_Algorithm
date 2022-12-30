/*
 * 아홉 난쟁이의 모자에 쓰여 있는 수가 주어졌을 때, 일곱 난쟁이를 찾는 프로그램 
 */
import java.util.Scanner;

public class B_3040 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(sum - arr[i] - arr[j] == 100) {
					arr[i] = 0;
					arr[j] = 0;
					for(int k = 0; k < arr.length; k++) {
						if(k != i && k!= j) {
							System.out.println(arr[k]);
						}
					}
				}
			}
		}
	}
}
