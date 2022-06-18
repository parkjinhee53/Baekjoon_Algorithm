/*
 * 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램 
 */
import java.util.*;
import java.io.*;

public class B_10845 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		Queue<Integer> q = new LinkedList<Integer>();
		int back = -1;
		
		for(int i = 0 ; i < n; i ++) {
			st = new StringTokenizer(br.readLine());
			String x = st.nextToken();
			
			switch(x) {
			case "push": // 정수 X를 큐에 넣는 연산 
				back = Integer.parseInt(st.nextToken());
				q.offer(back);	
				break;
			case "pop": // 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력 
				if(q.isEmpty()) {
					sb.append("-1").append("\n");
					break;
				}
				sb.append(q.poll()).append("\n");
				break;
			case "size": // 큐에 들어있는 정수의 개수를 출력
				sb.append(q.size()).append("\n");
				break;
			case "empty": // 큐가 비어있으면 1, 아니면 0을 출력 
				sb.append(q.isEmpty()? 1: 0).append("\n");
				break;
			case "front": // 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력 
				sb.append(q.isEmpty()? -1: q.peek()).append("\n");
				break;
			case "back": // 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력 
				sb.append(q.isEmpty()? -1: back).append("\n");
				break;
				
			}
		}
		System.out.print(sb);
	}
}