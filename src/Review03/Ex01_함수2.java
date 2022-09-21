package Review03;

public class Ex01_함수2 {
	public static void main(String[] args) {

		/*int sum = add();
		// 합을 여기서 출력
		System.out.println("합을 출력하세요 : "+sum);*/


	} // main

	static int add () {
		int a = 10 ,b = 20;		// 함수 내에서 변수를 받아 , 변수를 처리
		int sum = a+b;
		return sum;		// 처리한 결과 값을 메인으로 올려보냄 , 이 때 결과 값의 자료형의 형태가 동일하게 함수에 작용해야 함.
	} // add 함수
}
