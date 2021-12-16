/*
 * 학생 N명의 몸무게와 키가 담긴 입력을 읽어서 각 사람의 덩치 등수를 계산하여 출력 
 */
import java.util.Scanner; 
public class B_7568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt(); // 전체 사람의 수 입력받기
		int[][] arr = new int[n][2];
		
		for (int i =0; i<n; i++) {
			arr[i][0] = sc.nextInt(); // 몸무게 
			arr[i][1] = sc.nextInt(); // 키 
		}
		
		for(int i = 0; i < n; i++) {
			int rank = 1;
			for(int j = 0; j < n; j++) {
				if(i == j) {
					continue;
				}
				if(arr[i][0]< arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++;
				}
			}
			System.out.print(rank + " ");
		}
		sc.close();
	}
}
