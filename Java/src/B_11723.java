/*
 * 비어있는 공집합 S가 주어졌을 때, 연산을 수행하는 프로그램 
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B_11723 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Set<Integer> set = new HashSet<>(); 
		
		int n = sc.nextInt(); 

		for (int i = 0; i < n; i++) {
			String s = sc.next();
			int a;

			switch (s) {
			case "add" : // S에 x를 추가 
				a = sc.nextInt();
				set.add(a);
				break;   
			case "remove" : // S에서 x를 제거 
				a = sc.nextInt();
				set.remove(a);
				break;
			case "check" : // S에 x가 있으면 1을, 없으면 0을 출력 
				a = sc.nextInt();
				if (set.contains(a))
					sb.append("1\n");
				else
					sb.append("0\n");
				break;
			case "toggle" : // S에 x가 있으면 x를 제거하고, 없으면 x를 추가 
				a = sc.nextInt();
				if (set.contains(a))
					set.remove(a);
				else
					set.add(a);
				break;   
			case "all" : // S를 {1, 2, ..., 20} 으로 바꾸기 
				for (int j = 0; j < 20; j++) {
					set.add(j + 1);
				}
				break;
			case "empty" : // S를 공집합으로 바꾸기 
				set.clear();
				break;               
			}
		}

		System.out.println(sb);
	}
}
