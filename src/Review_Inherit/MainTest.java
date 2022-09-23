package Review_Inherit;

public class MainTest {

	public static void main(String[] args) {
		
//		Mother m = new Mother ();
//		System.out.println(" == 엄마는 슈퍼 클래스 ==");
//		m.job();
//		m.gene();
		
		
		/*
		 * Daughter d = new Daughter ();
		 * 
		 * System.out.println(" == 딸은 자식(상속) 클래스 ==");
		 * 
		 * d.job(); // Override d.gene(); // Override d.study();
		 */
		
//		Daughter d = new Mother ();
		
		// * 부모 변수에 자식객체 생성이 가능
//		Mother m = new Daughter () ;	// 부모 클래스의 변수를 자식 클래스의 생성자에 할당하는 경우
//		Daughter d = (Daughter) m ;		// 코드 상 에러는 없으나 구동시 에러 발생;
//		m.gene();		// 오버라이딩 된 메소드들 호출 가능
//		m.job();		// 오버라이딩 된 메소드들 호출 가능
//		m.study();
		
		Daughter d = new Daughter ();
		Mother m = (Mother) d;		// downcasting
		Daughter d2 = (Daughter) m;	// upcasting
		

		
//		 * 형변환 : casting
//			1> 기본형끼리
//			2> 참조형에서 상속관계가 있는 경우 가능
//			
//			String s = new String ("~~~~");
//			StringBuffer sb = (StringBuffer) s; => X
		
		
		
	}

}
