/*
 * 줄을 선 학생들이 차례로 뽑은 번호가 주어질 때 학생들이 최종적으로 줄을 선 순서를 출력하는 프로그램 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class B_2605 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			
			if(num == 0) {
				list.add(i + 1);
			}
			else {
				list.add(list.size() - num, i + 1);
			}
		}
		
		for(int i : list) {
			System.out.print(i + " ");
		}
	}

}
