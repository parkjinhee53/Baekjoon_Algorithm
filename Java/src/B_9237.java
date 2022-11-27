/*
 * 이장님을 며칠에 초대할 수 있는지 구하는 프로그램  
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B_9237 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Integer[] tree = new Integer[n];
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			tree[i] = sc.nextInt();
		}
		
		Arrays.sort(tree, Collections.reverseOrder()); // 내림차순 
		
		for(int i = 0; i < n; i++) {
			max = Math.max(max, tree[i]+ i + 1);
		}
		
		System.out.println(max + 1);
	}
}
