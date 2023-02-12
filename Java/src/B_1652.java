/*
 * 방의 크기 N과 방의 구조가 주어졌을 때, 가로로 누울 수 있는 자리와 세로로 누울 수 있는 자리의 수를 구하는 프로그램 
 */
import java.util.Scanner;

public class B_1652 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		char[][] arr = new char[100][101];
		int r = 0; // 가로
		int c = 0; // 세로 
		
		for(int i = 0; i < n; i++) {
			String s= sc.next();
			
			for(int j = 0; j < n; j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		
		for(int i = 0; i < n; i++) {
			int rcount = 0;
			int ccount = 0;
			
			for(int j = 0; j < n; j++) {
				if(arr[i][j] == '.') { // 가로 
					rcount++;
				}
				if(arr[i][j] == 'X' || (j == n - 1)) {
					if(rcount >= 2) {
						r++;
					}
					rcount = 0;
				}
				
				if(arr[j][i] == '.' ) { // 세로 
					ccount++;
				}
				if(arr[j][i] == 'X' || (j == n - 1)) {
					if(ccount >= 2) {
						c++;
					}
					ccount = 0;
				}
			}
		}
		System.out.println(r + " " + c);
	}
}
