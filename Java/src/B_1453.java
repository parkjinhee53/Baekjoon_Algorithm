/*
 * 거절당하는 사람의 수를 출력하는 프로그램
 */
import java.util.Scanner;

public class B_1453 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		boolean[] arr = new boolean[101]; 
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			
			if(arr[a] == true) { // 사람이 있으면 
				count++;
			}
			else { // 없으면 true로 바꾸기 
				arr[a] = true;
			}
		}
		System.out.println(count);
	}
}
