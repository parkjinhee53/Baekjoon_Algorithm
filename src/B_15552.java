/*
 * 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력(입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있음)
 */
import java.io.*;
import java.util.*;
public class B_15552 {
	public static void main(String[] args) throws IOException{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer s;
        
        for(int i = 0; i < n; i++){
            s = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(s.nextToken());
            int b = Integer.parseInt(s.nextToken());
            bw.write(a + b + "\n");
        }
        bw.flush();
        bw.close();
    }
}
