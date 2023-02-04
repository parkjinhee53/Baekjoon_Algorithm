/*
 * 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램 
 */
import java.util.Scanner;

public class B_2563 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 색종이 수 
		int[][] arr = new int[100][100];
		int count = 0;  
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int j = x; j < x + 10; j++) { // 색종이 길이가 10cm이어서 10 더해줌 
				for(int k = y; k < y + 10; k++) {
					arr[j][k] = 1;
				}
			}
		}
		
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				if(arr[i][j] == 1) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
