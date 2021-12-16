/*
 * 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램
 * 1. 길이가 짧은 것부터
 * 2. 길이가 같으면 사전 순으로
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B_1181 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] arr = new String[n];
		String temp = "";
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.next();
		}
		
		Arrays.sort(arr);
		Arrays.sort(arr, Comparator.comparing(String::length));
		
		for(int i = 0; i<arr.length; i++) {
			if(temp.equals(arr[i])) {
				continue;
			}
			else {
				System.out.println(arr[i]);
				temp = arr[i];
			}
		}
		sc.close();
	}
}
