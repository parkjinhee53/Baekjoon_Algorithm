/*
 * 이진 검색 트리를 전위 순회한 결과가 주어졌을 때, 이 트리를 후위 순회한 결과를 구하는 프로그램 
 */
import java.util.Scanner;
import java.io.IOException;

public class B_5639 {
	
	static class Node {
		int num; // 현재 노드 값 
		Node left; // 왼쪽 노드 
		Node right; // 오른쪽 노드 
		
		public Node(int num) { 
			this.num = num;
		}

		// 현재 노드의 데이터보다 작으면 왼쪽 서브트리, 크면 오른쪽 서브트리 
		public void add(int num) {
			if(num < this.num) {
				if(this.left == null) {
					this.left = new Node(num);
				}
				else {
					this.left.add(num);
				}
			}
			else {
				if(this.right == null) {
					this.right = new Node(num);
				}
				else {
					this.right.add(num);
				}
			}
		}
	}
	
	public static void postOrder(Node node) { // 후위 순회 
        if(node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.num);
        }
    }
	
	public static void main(String[]args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		Node root = new Node(key); // 노드의 루트 
		while(sc.hasNext()) {
			try { // 예외 발생할 수도 있음
				key = sc.nextInt(); // 트리를 전위 순회한 결과 입력받기 
				root.add(key);
			}
			catch (Exception e) { // 예외 발생 시 반복문 나감
				break;
			}
		}
		postOrder(root);
		sc.close();
	}
}
