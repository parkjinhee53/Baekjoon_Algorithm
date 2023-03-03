/*
 * 마지막 데이터가 처리되는 컴퓨터의 번호를 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
	    
	    for (int i = 0; i < t; i++) {
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int n = 1;
	        
	        for (int j = 0; j < b; j++){
	        	n = (a * n) % 10; // a에 b제곱 값 구해서 뒷자리만 가져오기 
	        }
	        if (n == 0) { // 뒷자리가 0이면 10으로 바꿈 
	        	n = 10;
	        }
	        System.out.println(n);
        }
	}
}
