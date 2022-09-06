package chapter05.EX01;

import java.util.Arrays;
import java.util.Scanner;

public class Using_Array08 {
	public static void main(String[] args) {
		
		// 정수 배열 방 10개를 생성
		// 임의의 값을 10개 방에 배정
		// 그 중 최대값을 뽑아서 출력하는 프로그램을 생성해 보세요.
		// 출력 : 배열 방 10개에서 최대값은 : ...
		// 출력 : 배열 방 10개에서 최소값은 : ...
		
		int [] arr = new int [10];
		
		Scanner s = new Scanner(System.in);
		System.out.println("임의의 정수를 입력하세요 : ");
		
		for (int i = 0 ; i <10 ; i++) {
			arr[i] = s.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for (int i =0 ; i < arr.length ; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} 
		}
		System.out.println("배열 방 10개에서 최대값은 : "+max);
		
		for (int i = 0 ; i <arr.length ; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("배열 방 10개에서 최소값은 : "+min);
	
		System.out.println("== 2번째 방법은 Arrays.sort() 메소드를 사용해서 출력 =======");
		Arrays.sort(arr);		// 배열 방의 값을 정렬을 한다. 0 (최소값), 1,2,3 ... arr.length -1 (최대값)
		System.out.println("최대값은 : " + arr[arr.length-1]);
		System.out.println("최소값 : " + arr[0]);
		
		System.out.println("=== Stream을 사용하는 경우 ==========");
		System.out.println("최대값 : " + Arrays.stream(arr).max().getAsInt());
		System.out.println("최소값 : " + Arrays.stream(arr).min().getAsInt());
	}
}
