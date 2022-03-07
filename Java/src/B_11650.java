/*
 * 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램 
 */
import java.util.Arrays;
import java.util.Scanner;

public class B_11650 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i][0] = sc.nextInt(); // x좌표 
			arr[i][1] = sc.nextInt(); // y좌표 
		}
		
		Arrays.sort(arr, (a1, a2) -> {
			if(a1[0] == a2[0]) { // x좌표가 같다면 y좌표 비교 
				return a1[1] - a2[1];
			}
			else {
				return a1[0] - a2[0];
			}
		});
		
		for(int i = 0; i < arr.length; i++) { // 정렬한 결과를 출력 
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
		
		
		sc.close();
	}
}
