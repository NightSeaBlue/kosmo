package chapter07.EX01;

public class Using_Method04 {

	//같은 클래스에서 메소드 호출
	// main method 는 static 키가 붙은 메소드
	//		//static 메소드에서는 인스턴스 메소드를 직접 호출이 불가능 (객체화 후 호출은 가능)
			//static 메소드는 직접 호출이 가능
	
	static void print() {
		System.out.println("안녕");
	}
	
	static int twice (int k) {		//인풋 값을 2배로 돌려주는 메소드
		return k*2;
	}
	
	static double sum (int m ,double n) {	//두 값을 받아서 더해서 되돌려 줌
		return m +n;
	}
	
	
	public static void main(String[] args) {
		// 같은 클래스 내부에서 메소드 호출
		
		print();		//
		
		int a = twice (3);		//twice (3) 값을 넣어 리턴값을 돌려받음.
		System.out.println(a);
		
		double d = sum (a,5.8);	//11.8
		System.out.println(d);
		
		
		
		
		
		
		
	}

}
