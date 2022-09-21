package Review03;

public class Ex02_멤버변수 {
	
	// static 변수 설정 , class 내에서 main 이나 함수 내에서 활용 가능
	static int a  = 10 , b = 20;
	static int sum =0;
	

	public static void main(String[] args) {

		add();
		// 두 수를 더한 결과를 출력
		System.out.println("합 : "+ sum);

	}
	
	static void add () {
		sum = a+b;
	}


}
