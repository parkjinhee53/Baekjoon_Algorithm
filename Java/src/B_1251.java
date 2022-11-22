/*
 * 단어가 주어지면, 이렇게 만들 수 있는 단어 중에서 사전순으로 가장 앞서는 단어를 출력하는 프로그램
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class B_1251 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String[] st = new String[3];
		ArrayList<String> list = new ArrayList<>();
		
		for(int i = 1; i < s.length() - 1; i++) {
			for(int j = i + 1; j < s.length(); j++) {
				st[0] = s.substring(0, i);
				st[1] = s.substring(i, j);
				st[2] = s.substring(j, s.length());
				
				StringBuffer sb = new StringBuffer();
				
				for(int k = 0; k < 3; k++) {
					for(int l = st[k].length() - 1; l >= 0; l--) {
						sb.append(Character.toString(st[k].charAt(l)));
					}
				}
				
				list.add(sb.toString());
				sb.setLength(0);
			}
		}
		Collections.sort(list);
		System.out.println(list.get(0));
	}
}
