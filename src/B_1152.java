/*
 * 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class B_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String x = sc.nextLine(); // 문장 입력받기

        StringTokenizer st = new StringTokenizer(x, " "); // 공백 기준으로 나눈 문자 저장
        System.out.println(st.countTokens()); // 단어 개수 출력
        
        sc.close(); // sc 객체 종료
    }
}