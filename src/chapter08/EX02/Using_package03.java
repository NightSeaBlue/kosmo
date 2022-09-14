package chapter08.EX02;

//import 를 사용하지 않고 외부 패키지 접근 : 클래스의 전체 이름을 사용 (패키지명 + 클래스명)
	// A 클래스 (public) , B 클래스 (default) (접근X)

public class Using_package03 {

	public static void main(String[] args) {
		
		
		//전체이름 : 패키지명.클래스명(public)
		chapter08.EX01.A a = new chapter08.EX01.A();
		
		System.out.println(a.m);	//변수가 default로 설정되어 있어 접근 불가
		System.out.println(a.n);
		a.print();			//외부 패키지에서 접근 가능 (A 접근제어자가 public)
		
		
		
	}

}
