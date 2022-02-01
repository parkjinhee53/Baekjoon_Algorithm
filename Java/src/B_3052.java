/*
 * 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		int count = 0;
		int counts[] = new int[42];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			counts[arr[i]%42]++;
		}
		
		for(int i = 0; i < counts.length; i++) {
			if(counts[i] != 0) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}