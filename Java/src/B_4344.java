/*
 * 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력 
 */
import java.util.Scanner;

public class B_4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt(); // 테스트 개수 
		
		for(int i = 0; i < c; i++) {
		
			int n = sc.nextInt(); // 학생 수 
			int[] arr = new int[n]; // 점수 저장할 배열 
		
			double sum = 0; // 점수 합 
		
			for(int j = 0; j < n; j++) {
				int s = sc.nextInt();
				arr[j] = s;
				sum += s;
			}
		
			double avg = sum/n; // 평균 점수 
			double count = 0; // 평균 넘는 학생 수 
		
			for(int k = 0; k < n; k++) {
				if(arr[k] > avg) {
				count++;
				}
			}
		
			System.out.printf("%.3f%%\n",(count/n)*100);
		}
		sc.close();
	}
}
