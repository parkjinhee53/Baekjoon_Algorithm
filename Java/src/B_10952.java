/*
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램
 */
import java.util.Scanner;

public class B_10952 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			int a = sc.nextInt();
			int b = sc.nextInt();
		
			if(a == 0 && b == 0){
				break;
			}
			System.out.println(a+b);
		}
		sc.close();
	}
}