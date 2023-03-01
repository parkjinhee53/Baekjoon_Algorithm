/*
 * 10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램 
 */
public class B_4673 {

	public static void main(String[] args) {

		boolean[] check = new boolean[10001]; // 10000까지임 
		
		for(int i = 1; i < 10001; i++) {
			int n = d(i);
			
			if(n < 10001) { // 10000 보다 작거나 같은 수이기에 10000이 넘으면 안됨 
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < 10001; i++) {
			if(!check[i]) { // 생성자가 없는 숫자를 구하기 때문에 false만 출력 
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}

	public static int d(int num){
		int sum = num;
    
		while(num != 0){
			sum += num % 10; // 첫 째 자리수 
			num /=10; // 10을 나눠서 첫 째 자리수를 없앰 
		}
    
		return sum;
	}
}
