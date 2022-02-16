/*
 * N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램 
 */
import java.util.Scanner;

public class B_1676 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		
		// 소인수분해를 해서 2와 5가 있으면 뒷자리에 0이 있는데 두 수의 개수가 동일해야 함 
		// 반복문을 통해 5로 나눈 수를 누적합해주면 됨 (소인수분해 시 2의 개수가 5의 개수보다 많기 때문)
		while(n >= 5) {
			count += n / 5;
			n /= 5;
		}
		
		System.out.println(count); // 0의 개수를 출력 
		
		sc.close();
	}
}
