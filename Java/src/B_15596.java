/*
 * 정수 n개가 주어졌을 때, n개의 합을 구하는 함수 작성 
 */
public class B_15596 {
	
	long sum(int[] a) {
		long sum = 0;
        
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
}
