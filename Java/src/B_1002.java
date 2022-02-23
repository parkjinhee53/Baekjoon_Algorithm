/*
 * 조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고, 조규현이 계산한 류재명과의 거리 r1과 
 * 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때, 류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을
 */
import java.util.Scanner;

public class B_1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); // 테스트 케이스의 개수 
		
		for(int i = 0; i < t; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			System.out.println(count(x1,y1,r1,x2,y2,r2));
		}
		sc.close();
	}
	
	public static int count(int x1, int y1, int r1, int x2, int y2, int r2) {
	    
		// 두 점 거리의 제곱
		int d = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); 
 
 
		// 중점과 반지름이 같을 경우(접점의 개수 무한)
		if(x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		}
		
		// 두 점 사이의 거리가 각 원의 반지름의 합보다 클 경우 
		else if(d > Math.pow(r1 + r2, 2)) {
			return 0;
		}
 
		// 한 원 안에 다른 원이 있으면서 접점이 없을 때
		else if(d < Math.pow(r2 - r1, 2)) {
			return 0;
		}
		
		// 내접할 경우 
		else if(d == Math.pow(r2 - r1, 2)) {
			return 1;
		}
        
		// 외접할 경우  
		else if(d == Math.pow(r1 + r2, 2)) {
			return 1;
		}
		
		else {
			return 2;
		}
		
	}
}
