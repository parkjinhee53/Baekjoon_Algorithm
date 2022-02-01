/*
 * 온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다.  
 * 이때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램 
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class B_10814 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 온라인 저지 회원의 수
		String[][] arr = new String[n][2];
		
		for(int i = 0; i < n; i++) {
			arr[i][0] = sc.next();	// 나이
			arr[i][1] = sc.next();	// 이름
		}
		
		Arrays.sort(arr, new Comparator<String[]>() { // 나이순으로 정렬
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
		});
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}