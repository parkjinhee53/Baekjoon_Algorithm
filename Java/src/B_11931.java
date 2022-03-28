/*
 * N개의 수가 주어졌을 때, 이를 내림차순으로 정렬하는 프로그램 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class B_11931 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        Integer arr[] = new Integer[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr, Collections.reverseOrder()); // 내림차순으로 정렬 
		
		for (Integer i : arr) { // 내림차순으로 정렬한 결과를 한 줄에 하나씩 출력 
			bw.write(i + "\n"); 
		}
		
        bw.flush();
    }
}
