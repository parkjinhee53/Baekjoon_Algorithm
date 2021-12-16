/*
 * 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬 
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B_1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.nextLine();
		
		String[] s = n.split("");
		
		Arrays.sort(s, Comparator.reverseOrder());
		for(String str : s) {
			System.out.print(str);
		}
		
		sc.close();
	}
}