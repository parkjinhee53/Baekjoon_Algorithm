/*
 * 입력 괄호 문자열이 올바른 괄호 문자열(VPS)이면 “YES”, 아니면 “NO”를 한 줄에 하나씩 차례대로 출력 
 */
import java.util.Scanner;

public class B_9012 {	
	public Node top; // 노드의 top
	public void stack() {
		this.top = null;
	}
	
	public class Node {
		public char data; // 각각의 노드가 저장할 데이터 
		public Node nextnode; // 다음 노드의 정보
		
		public Node(char data) { // 노드가 생성될 때 그것을 초기화해줄 메소드, 노드 값이 data 생성자의 매개변수로 전달 
			this.data = data;
			this.nextnode = null;
		}
	}
	
	public void push(char data) { // 스택 추가
		Node newNode = new Node(data); 
		newNode.nextnode = top;
		top = newNode;
	}
	
	public char pop() { // 스택 삭제
		if(empty()) {
			return 0; // char의 null 값은 0임
		}
		else {
			char data = top.data;
			top = top.nextnode;
			return data;
		}
	}
	
	public boolean empty() { // 스택이 비어있는지
		return top == null;
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // 테스트 개수 입력받기
		
		for(int i = 0; i < t; i++) {
			B_9012 stack = new B_9012();
			String s = sc.next(); // 괄호 입력받기
			int error = 0; // 주어진 괄호 문자열이 VPS 인지 아닌지
			for(int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				if(c == '(') {
					stack.push(c);
				}
				else if(c == ')') {
					if(stack.empty()) { // 스택이 비어있으면 )가 남기 때문에
						error = 1;
						break;
					}
					else { // 비어있지 않다면
						stack.pop(); // ( 삭제 
					}
				}
			}
			if(stack.empty()) {
				if(error == 0) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
