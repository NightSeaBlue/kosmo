package chapter07.EX01;

import java.util.Arrays;

public class UsingMethod06 {
	
	static int add (int [] a ) {
		//들어온 배열의 모든 값을 더해서 더한 값을 리턴
		int temp = 0;
		for (int i = 0; i <a.length; i++) {
			temp+=a[i];
			}
		return temp;
		
	}
	
	static int div (int [] a ) {
		//들어온 배열의 모든 값을 빼서 뺀 값을 리턴
		int temp = 0;
		for (int i = 0 ; i <a.length; i++) {
			temp-=a[i];
		}
		return temp;
	}
	
	static long mul (int [] a ) {
		//들어온 배열의 모든 값을 곱해서 곱한 값을 리턴
		int temp = 1;
		for (int i = 0 ; i <a.length; i++) {
			temp *= a[i];
		}
		
		return temp;
	}
	
	static double avg (int [] a ) {
		//들어온 배열의 모든 값의 평균을 구해 평균값을 리턴
		int temp =0;
		int count = 0;
		for (int i = 0 ; i <a.length; i++) {
			temp+=a[i];
			count++;
			}
		double avg = temp/count;
		return avg;
	}

	public static void main(String[] args) {
		// 1~100까지 7의 배수만 저장 후 각 메소드 호출
		int [] a = new int [100/7];
		System.out.print("저장된 7의 배수 : ");
		for (int i =0, j = 7 ; i<a.length; i++, j+=7) {
			a[i] =j;
			}
		System.out.println(Arrays.toString(a));
		
		int sum = add(a);
		System.out.println("더한 값 : " + sum);
		int div = div(a);
		System.out.println("뺀 값 : " + div);
		long mul = mul(a);
		System.out.println("곱한 값 : " + mul);
		double avg = avg(a);
		System.out.println("평균 : " + avg);
		
		
	}

}
