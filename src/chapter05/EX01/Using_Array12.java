package chapter05.EX01;

import java.util.Arrays;

public class Using_Array12 {

	public static void main(String[] args) {
		
		
		// 1 ~ 1000 까지 배열(arr)에 저장 후
		
		//1. 배열 선언
		int [] arr = new int [1000];
		
		//2. [입력] for 문을 사용해서 arr 배열 변수에 값을 할당
		for (int i =0,j =1; i <1000; i++,j++) {
			arr[i] = j;
		}
		
		//3. [출력] for 문을 사용해 arr 배열 변수의 값을 출력
		for (int i =0 ; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("=========================");
		//4. [출력] Enhanced for 문을 사용해서 값을 출력
		for (int k : arr) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("=============================");
		//5. [출력] Arrays.toString(arr)을 사용해서 값을 출력
		System.out.print(Arrays.toString(arr)+" ");
		System.out.println();
		System.out.println("==============================");
		
		
	}

}
