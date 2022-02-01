/*
 * 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램 
 */
import java.util.Scanner;

public class B_1924 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int month = sc.nextInt(); // 달 입력받기
        int day = sc.nextInt(); // 일 입력받기
        int sum = 0;
        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i=1; i<=12; i++) {
            if(i==month) {
                break;
            }
            sum += months[i];
        }
        sum += day;
        int d = sum%7;
        switch(d) {
            case 0 : System.out.println("SUN"); break;
            case 1 : System.out.println("MON"); break;
            case 2 : System.out.println("TUE"); break;
            case 3 : System.out.println("WED"); break;
            case 4 : System.out.println("THU"); break;
            case 5 : System.out.println("FRI"); break;
            case 6 : System.out.println("SAT"); break;
        }
        sc.close();
	}
}