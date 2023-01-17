/*
 * 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 구하는 프로그램 
 */
import java.util.Scanner;

public class B_2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String str[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i = 0; i < str.length; i++) {
			if(s.contains(str[i])) {
				s = s.replace(str[i], "0");
			}
		}
		System.out.println(s.length());
	}
}
