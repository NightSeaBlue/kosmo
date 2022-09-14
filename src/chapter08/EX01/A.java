package chapter08.EX01;


	// 접근 제어자 : 캡슐화, 객체를 보호하기 위해서
	// 클래스 이름 앞에 : Public, default(명시하지 않고 생략되어 있음)
	// 필드, 메소드 앞에 : public, protected, default(생략됨), private

	//	*클래스명, 필드명, 메소드명 앞에 반드시 접근 제어자가 할당되어 있음.

	// 1. public : 같은 패키지의 모든 클래스에서 접근 가능, 다른 패키지에서도 접근 가능
	// 2. protect : 같은 패키지의 모든 클래스에서 접근 가능,
	//				다른 패키지에서 상속 관계에 있을 때만 접근 가능
	// 3. default : 같은 패키지 내에서 접근 가능, 다른 패키지에선 접근 불가
	// 4. private : 같은 파일에서만 접근 가능, 같은 패키지에선 접근 불가
	//				다른 패키지에서도 접근 불가

	
public class A {		//다른 패키지에서 class 접근 허용
	public int m = 3;
	public int n = 4;
	
	public void print () {
		System.out.println("Import Test");
	}
}
