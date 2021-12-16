/*
 * 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램 
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B_1260 {
	static int n; // 정점의 개수
	static int m; // 간선의 개수
	static int start; // 탐색을 시작할 정점의 번호
	static int[][] visit; //간선 연결상태
	static boolean[] visited; //확인 여부
	
	public static void DFS(int start) {
		visited[start] = true;
		System.out.print(start + " ");
		
		for(int i = 1; i <= n; i++) {
			if(visit[start][i] == 1 && visited[i] == false) {
				DFS(i);
		      }
		}
	}
	
	public static void BFS(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visited[start] = true;
		System.out.print(start + " ");
		
		while(!q.isEmpty()) {
		      int temp = q.poll(); // 1
		      
		      for(int i = 1; i <= n; i++) {
		        if(visit[temp][i] == 1 && visited[i] == false) {
		          q.offer(i);
		          visited[i] = true;
		          System.out.print(i + " ");
		        }
		      }
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // 정점의 개수
		m = sc.nextInt(); // 간선의 개수
		start = sc.nextInt(); // 탐색을 시작할 정점의 번호
		
		visit = new int[1001][1001]; //좌표를 그대로 받아들이기 위해 +1해서 선언
		visited = new boolean[1001]; //초기값 False
		  
		for(int i = 0; i < m; i++) { 
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			visit[a][b] = visit[b][a] = 1;
		}
		
		DFS(start); // dfs 호출
		  
		visited = new boolean[1001]; // 확인상태 초기화
		System.out.println(); // 줄바꾸기 
		  
		BFS(start); // bfs 호출
	}
}
