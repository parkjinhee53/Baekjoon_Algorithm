/*
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램 
 */
import java.util.Scanner;

public class B_2750 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // 수의 개수 입력받기
        int[] arr = new int[n]; // 입력받은 수의 배열
        int temp;// 배열 바꿀 때 저장 변수

        for(int i=0;i<n;i++){ // n만큼 반복하면서 배열에 저장
          arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){ // 반복문으로 배열 바꾸기
          for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
              temp=arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
            }
          }
        }

        for(int i=0;i<n;i++){
          System.out.println(arr[i]); // 배열 출력
        }
        sc.close();
	}
}