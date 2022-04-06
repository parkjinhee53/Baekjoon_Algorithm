/*
 * 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램 
 */
import java.util.Scanner;

public class B_10808 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[26];
		String s = sc.nextLine();
		
		// 아스키코드로 알파벳 개수 알아내기 
		for(int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)-97]++;
		}
		
		// 단어에 포함되어 있는 a의 개수, b의 개수, …, z의 개수를 공백으로 구분해서 출력 
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}
}
