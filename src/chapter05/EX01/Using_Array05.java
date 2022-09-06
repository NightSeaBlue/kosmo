package chapter05.EX01;

import java.util.Arrays;

public class Using_Array05 {

	public static void main(String[] args) {
		// 1~500까지 3의 배수를 배열에 저장
		// 출력 : 1. 직접출력 2. for 문 3. enhanced for 4.toString()
		// 합계 및 평균 출력
		
		//1. 배열 선언 (3의 배수의 갯수 166개)
		int count = 0;
		int [] arr = new int [500/3];
		for (int i =0 , j=3 ; i< arr.length ; i++, j+=3) {
			if(j <= 500) {
				arr[i] = j;
				count++;
			}
		}
		
		//2. 출력
		System.out.println("1. 직접 출력");
		System.out.println(arr[0]);
		System.out.println("2. for 출력");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
			System.out.println(" ");
		System.out.println("3.enhanced for 출력");
		for (int k : arr) {
			System.out.print(k + "\t");
		}
			System.out.println(" ");
		System.out.println("4. toString() 출력");
		System.out.print(Arrays.toString(arr)+ "\t");
		System.out.println(" ");
		//합계 및 평균 구하기
		int sum = 0;
		for (int i = 0; i<arr.length ; i++) {
			sum+=arr[i];
		}
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+sum/(double)count);
	}

}
