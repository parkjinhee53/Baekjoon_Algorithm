/*
 * 10보다 작거나 같은 자연수 N개를 주면 합을 구하는 프로그램 
 */
import java.util.Scanner;

public class B_9085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int sum = 0;
            
            for (int j = 0; j < a; j++) {
                sum += sc.nextInt();
            }
            System.out.println(sum);
        }
	}

}
