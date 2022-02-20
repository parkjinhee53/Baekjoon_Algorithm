/*
 * 서울의 오늘 날짜를 출력하는 프로그램 
 */
import java.util.Date;
import java.text.SimpleDateFormat;

public class B_10699 {
	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		Date d = new Date();
		
		System.out.println(format.format(d));
	}
}
