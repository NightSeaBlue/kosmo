package chapter07.EX01;

public class Using_Method06_T {

	static int add (int [] a ) {
		//들어온 배열의 모든 값을 더해서 더한 값을 리턴
		int sum = 0;	//각 배열의 방의 값을 가져와서 더해서 저장
		for (int i = 0 ; i <a.length; i++) {
			sum+=a[i];		// sum = sum+a[i]
		}
		return sum;
		
	}
	
	static int div (int [] a ) {
		//들어온 배열의 모든 값을 빼서 뺀 값을 리턴
		int div = 7;
		for (int i = 0 ; i <a.length; i++) {
			if (i == 0 ) {continue;}		//i==0 일 경우 아래 내용을 실행하지 않고 다음으로 넘어감
			div-=a[i];		//div = div - a[i]
		}
		return div;
	}
	
	static long mul (int [] a ) {
		//들어온 배열의 모든 값을 곱해서 곱한 값을 리턴
		long mul = 1;
		for (int i = 0 ; i <a.length; i++) {
			mul*=a[i];
		}
		return mul;
	}
	
	static double avg (int [] a ) {
		//들어온 배열의 모든 값의 평균을 구해 평균값을 리턴
		int sum = 0 ;
		for (int i = 0 ; i < a.length; i++) {
			sum+=a[i];		//sum = sum +a[i]
		}
		double avg = sum / (double) a.length;
		return avg;
			}
	
	
	public static void main(String[] args) {
		
		// 배열에 7의 배수를 저장
		int [] arr1 = new int [100/7];
		for (int i = 0, j=7; i<arr1.length; i++, j+=7) {
			arr1[i] = j;
		}
		
		// 배열의 각 방의 내용을 출력
		for (int i = 0 ; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("========================");
		
		//메소드 호출 : add(arr1)
		int sum = add(arr1);
		System.out.println("더한 값 : " +sum);
		
		//메소드 호출 : div(arr1)
		int div = div(arr1);
		System.out.println("뺀 값 : "+div);
		
		//메소드 호출 : mul(arr1)	int 범위를 넣는다. ==> long
		long mul = mul(arr1);
		System.out.println("곱한 값 : "+mul);	
			//int : 1760012288
			//long : 4513787149822699520
		
		//메소드 호출 : avg (arr1)
		double avg = avg(arr1);
		System.out.println("평균 : " + avg);
		
		
		
		
	}

}
