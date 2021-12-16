/*
 * 점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램 
 */
import java.util.Scanner;

public class B_14681 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > 0) {
			if(y > 0) {
				System.out.print("1");
			}
			else {
				System.out.print("4");
			}
		}
		else {
			if(y > 0) {
				System.out.print("2");
			}
			else {
				System.out.print("3");
			}
		}
		
		sc.close();
	}
}
