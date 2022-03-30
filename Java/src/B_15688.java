/*
 * N개의 수가 주어졌을 때, 이를 비내림차순으로 정렬하는 프로그램 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_15688 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);
		
        for (int i = 0; i < n; i++) { // 비내림차순으로 정렬한 결과를 한 줄에 하나씩 출력 
			sb.append(arr[i]).append("\n");
		}
		System.out.println(sb);
    }
}