/*
 * N이 주어졌을 때, 제일 마지막에 남게 되는 카드를 구하는 프로그램 
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B_2164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			q.add(i);
		}
		
		while(q.size() != 1) {
			q.poll(); // 제일 위에 있는 카드 버림 
			q.offer(q.poll()); // 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 둠
		}
		
		System.out.println(q.poll()); // 마지막에 남게 되는 카드 출력 
		
		sc.close();
	}
}
