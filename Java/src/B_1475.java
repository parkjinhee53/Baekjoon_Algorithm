/*
 * 다솜이의 방 번호가 주어졌을 때, 필요한 세트의 개수의 최솟값을 출력하는 프로그램 
 */
import java.util.Arrays;
import java.util.Scanner;

public class B_1475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String n = sc.next();
		int arr[] = new int[10];
		
		for(char c : n.toCharArray()) {
			int a = c - '0';
			
			if(a == 9) {
				a = 6;
			}
			arr[a]++;
		}
		
		arr[6] = (arr[6] / 2) + (arr[6] % 2);
		
		Arrays.sort(arr);
		
		System.out.println(arr[9]);
	}
}
