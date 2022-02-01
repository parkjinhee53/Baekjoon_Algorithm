/*
 * 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램 
 */
import java.util.Scanner;

public class B_2577 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        
	        int arr[] = new int[10];
	        int r = a*b*c;
	        
	        while(r > 0) {
	        	arr[r % 10]++; // 0부터 새기 때문에 바로 10을 나눈 나머값이 배열의 현재 위치이기 때문에 
	        	               // 현재 위치에 하나씩 더해주면 그 숫자가 얼마나 나왔는지 알 수 있음
	        	r /= 10; // 10으로 나눠서 몫만 저장
	        }
	        
	        for(int i = 0; i < arr.length; i++) {
	        	System.out.println(arr[i]);
	        }
	        sc.close();
	 }
}