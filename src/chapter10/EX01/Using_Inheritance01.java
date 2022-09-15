package chapter10.EX01;

// 클래스 내부 구성 요소 : 1. 필드 , 2. 생성자, 3. 메소드 , 4. 이너 클래스

// 클래스 외부 구성 요소 : 1. 패키지 , 2. import , 3. 외부 클래스

// 상속(Inheritance) : 객체 지향 언어의 꽃
//	-- 부모 클래스 (Super Class) 의 필드와 메소드, 이너클래스를 자식 클래스에게 물려준다.
//	-- 자식 클래스 (Child Class) 는 부모 클래스의 코드 (
//	-- 중복된 코드를 방지할 수 있다.
//	-- 코드를 간결하게 사용.
//	-- 유지 보수를 아주 쉽게 한다.
//	-- 다형성 사용 : 부모 클래스의 메소드를 자식 클래스에서 재정의해서 사용
//			-- 다양한 타입으로 사용 가능.

// 부모 클래스 (Super Class) : 자식 클래스의 공통적인 특징을 가지는 클래스

class Human {		// 인간 : 부모 클래스 : 자식 클래스의 공통적인 필드와 메소드를 선언
	// 필드
	String name;
	int age;
	
	// 메소드 정의
	void eat () {
		System.out.println("모든 사람은 먹는다.");
	}
	
	void sleep () {
		System.out.println("모든 사람은 잠을 잔다.");
	}
	
	void print () {
		System.out.println(name + " , "+age);
	}
	
}

//자식 클래스 : 부모 클래스의 필드와 메소드를 그대로 상속 받는다.
	// -- 자식 클래스 만의 특징이 적용된 필드와 메소드를 선언 한다.

class Student extends Human {		// Student class 는 Human class를 상속 받는다. 
	// 부모 클래스의 필드와 메소드가 그대로 내려온다.
	// 자식 클래스의 특징을 가진 필드와 메소드를 선언.
	int studentID;		// 자식 클래스에서 선언된 필드
	void goToSchool () {	// 자식 클래스에서만 사용 가능한 메소드
		System.out.println("학생은 학교에 갑니다.");
	}
	
}

class Worker extends Human {		// 직장인
	// 부모 클래스의 필드와 메소드가 그대로 내려온다.
	int workerID;
	void goToWork () {
		System.out.println("직장인은 일하러 갑니다.");
	}
	
}

class Professor extends Human {	// 교수
	int professorID;
	void goToCollage () {
		System.out.println("교수는 대학에 갑니다.");
	}
	
}


public class Using_Inheritance01 {

	public static void main(String[] args) {
		
		// 1. Human class 객체 생성 (Super Class)
		System.out.println(" == Human 객체 출력 == ");
		Human h = new Human ();
		
		h.name = "홍길동";
		h.age = 30;
		
		h.print();
		h.eat();
		h.sleep();
		
		// 2. Student class 객체 생성 (Child Class)
		System.out.println(" == Student 객체 출력 == ");
		Student s = new Student ();
		
		s.name = "이도";		// 부모에서 상속된 필드
		s.age = 15;			// 부모에서 상속된 필드
		s.studentID = 1000;	// Student 클래스에 존재하는 필드
		
		s.print();
		s.eat();
		s.sleep();
		s.goToSchool();
		
		// 3. Worker 클래스 객체 생성 (자식)
		System.out.println(" == Worker 객체 출력 == ");
		Worker w = new Worker ();
		
		w.name = "신사임당";	// 상속 필드
		w.age = 33;			// 상속 필드
		w.workerID = 1001;	// 자신의 필드
		
		w.print();			// 상속 메소드
		w.eat();			// 상속 메소드
		w.sleep();			// 상속 메소드
		w.goToWork();		// 자신의 메소드
		
		// 4. Professor 클래스 객체 생성 (자식)
		System.out.println(" == Professor 객체 출력 ==");
		Professor p = new Professor ();
		
		p.name = "이양봉";		// 상속
		p.age = 61 ;			// 상속
		p.professorID = 10408;	// 자신
		
		p.print();				// 상속
		p.eat();				// 상속
		p.sleep();				// 상속
		p.goToCollage();		// 자신	

	}

}
