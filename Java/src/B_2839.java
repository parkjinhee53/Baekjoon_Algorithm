/*
 * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램 
 */
import java.util.Scanner;

public class B_2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // N킬로그램 
		
		if(n == 4 || n == 7) { // 4 또는 7이면 -1 출력 
			System.out.println(-1);
		}
		else if(n % 5 == 0) { // 5의 배수면 
			System.out.println(n / 5);
		}
		else if (n % 5 == 1 || n % 5 == 3) { // 5로 나눈 나머지가 1 또는 3이면 
			System.out.println((n / 5) + 1);
		}
		else if (n % 5 == 2 || n % 5 == 4) { // 5로 나눈 나머지가 2 또는 4이면 
			System.out.println((n / 5) + 2);
		}
		
		sc.close();
	}
}
