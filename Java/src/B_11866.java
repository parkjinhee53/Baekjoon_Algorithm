/*
 * N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램 
 */
import java.util.*;

public class B_11866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<Integer>();

		int n = sc.nextInt();
		int k = sc.nextInt(); 
		
		for(int i = 1; i <= n; i++) {
			q.add(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");

		while(q.size() > 1) {

			for(int i = 0; i < k - 1; i++) {
				q.add(q.poll());
			}

			sb.append(q.poll()).append(", ");
		}
		
		sb.append(q.poll()).append(">");
		
		System.out.println(sb);
	}
}
