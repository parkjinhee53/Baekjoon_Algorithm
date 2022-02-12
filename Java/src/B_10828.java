/*
 * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램 
 */
import java.util.Scanner;
import java.util.Stack;

public class B_10828 {
	
	public static Stack<Integer> stack = new Stack<>();
	public static int size = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 명령의 수 N 
		StringBuilder sb = new StringBuilder(); // StringBuilder는 문자열을 추가, 삭제, 수정할 수 있게 해줌  
		
		for(int i = 0; i< n; i++) {
			String s = sc.next(); 
			
			switch(s) {
			
			case "push":
				int a = sc.nextInt();
				stack.push(a);
				break;
				
			case "pop":
				sb.append(pop()).append('\n');
				break;
				
			case "size":
				sb.append(size()).append('\n');
				break;
			
			case "empty":
				sb.append(empty()).append('\n');
				break;	
				
			case "top":
				sb.append(top()).append('\n');
				break;	
			}
		}
		
		System.out.println(sb);
	}
	
	// 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력, 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력
	public static int pop() { 
		if(stack.isEmpty()) {
			return -1;
		}
		else {
			int tmp = stack.peek();
			stack.pop();
			return tmp;
		}
	}

	// 스택에 들어있는 정수의 개수를 출력 
	public static int size() {
		return stack.size();
	}

	// 스택이 비어있으면 1, 아니면 0을 출력
	public static int empty() {
		if(stack.isEmpty()) {
			return 1;
		}
		else {
			return 0;
		}
	}

	// 스택의 가장 위에 있는 정수를 출력, 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력
	public static int top() {
		if(stack.isEmpty()) {
			return -1;
		}
		else {
			return stack.peek();
		}
	}
}
