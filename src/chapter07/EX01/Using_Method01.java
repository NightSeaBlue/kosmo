package chapter07.EX01;

class B {
	//1. 리턴 타입이 없고 (Void) , 입력 매개변수가 없는 메서드
	void print () {
		System.out.println("안녕");
	}
	
	//2. 리턴 타입 int , 입력 매개변수가 없는 메서드
	int data () {
	return 3;	//3은 반드시 정수여야 함.
	}
	
	
	//3. 리턴 타입 double , 입력 매개변수 2개 인 메서드
	double sum (int a, double b) {
	return a+b ;	//반드시 double 형으로 출력
	}
	
	//4. 리턴 타입 없음 (Void) , 내부 함수를 종료함 (return;)
		 //메소드 내부에서 return 을 만나면 메소드 종료.
	void printMethod (int m) {
		if (m <=0|| m> 12) {
			System.out.println("입력이 잘못되어 메소드 종료.");
			return;			
			//System.out.println("출력되지 않는 부분"); return 이후로 코드 입력시 오류 발생 (도달 불가, 메소드 종료)
			
		} else {
			System.out.println("입력한 달은 : "+ m + " 달 입니다.");
		}
	}
	
	//5. 리턴 타입 boolean, 입력 매개변수가 없는 메서드
	boolean call () {		//call () 를 호출할 경우 true를 돌려줌
		
		return true;
	}
	
	
}


public class Using_Method01 {

	public static void main(String[] args) {
		// 메소드 사용
		
		// 객체 생성 (b)
		B b = new B ();
		b.print();
		System.out.println(b.data());
		System.out.println("== 리턴 double , 입력 매개변수 2개 ===");
		System.out.println(b.sum(3, 5.5));
		b.printMethod(0);		//1~12 까지만 입력 가능 , 그 외는 메소드 종료.
		System.out.println(b.call());
		
		
	}

}
