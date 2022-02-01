/*
 * 오늘 하루 동안 팔린 책의 제목이 입력으로 들어왔을 때, 가장 많이 팔린 책의 제목을 출력하는 프로그램 
 */
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class B_1302 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		int n = sc.nextInt(); //오늘 하루 동안 팔린 책의 개수 
		String book = ""; // 책 제목 저장 
		int max = 0; // 가장 많이 팔린 책의 개수를 알기 위해 max 생성 
		
		for(int i = 0; i < n; i++) { // 팔린 책 개수만큼 반복해서 책 입력받기 
			book = sc.next();
			if(map.containsKey(book)) { // 똑같은 책을 입력받으면 1 증가 
				map.put(book, map.get(book) + 1); 
			}
			else { // 처음 입력받은 책이면 1 
				map.put(book, 1); 
			}
		}
		
		for(String key : map.keySet()) { // map에 있는 key 값만 반복하면 해당 value 값과 비교해서 max 구하기 
			max = Math.max(max, map.get(key));
		}
		
		ArrayList<String> arr = new ArrayList<String>(map.keySet());
		Collections.sort(arr); // 오름차순 정렬 
		
		for(String key : arr) { // 리스트에 담긴 key 값 반복 
			if(map.get(key) == max) { // key 값에 해당하는 value가 max랑 같으면 가장 많이 팔린 책임 
				System.out.println(key);
				break;
			}
		}
	}
}
