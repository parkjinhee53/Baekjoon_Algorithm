/*
 * 모든 수를 받아 적은 후 그 수의 합을 구하는 프로그램 
 */
import java.util.Scanner;
import java.util.Stack;

public class B_10773 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s = new Stack<Integer>();
		
		int k = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i < k; i++) {
			int n = sc.nextInt();
			
			if(n == 0) { // 0이면 가장 최근에 재민이가 쓴 수를 지움 
				s.pop();
			}
			else {
				s.push(n);
			}
		}
		
		for(int i : s) {
			sum += i;
		}
		
		System.out.println(sum); // 재민이가 최종적으로 적어 낸 수의 합을 출력 
		
		sc.close();
	}
}
