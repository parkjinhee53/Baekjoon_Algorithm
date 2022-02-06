/*
 * 햄버거와 음료의 가격이 주어졌을 때, 가장 싼 세트 메뉴의 가격을 출력하는 프로그램 
 */
import java.util.Scanner;

public class B_5543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5]; 
		
		for(int i = 0; i < 5; i++) { // 햄버거, 음료 가격 입력 
			arr[i] = sc.nextInt();
		}
		
		int burger = arr[0];
		int drink = arr[3];
		
		for(int i = 0; i < 3; i++) { // 햄버거 
			if(burger > arr[i]) {
				burger = arr[i];
			}
		}
		
		for(int i = 3; i < 5; i++) { // 음료 
			if(drink > arr[i]) {
				drink = arr[i];
			}
		}
		
		System.out.println(burger + drink -50);
		sc.close();
	}
}
