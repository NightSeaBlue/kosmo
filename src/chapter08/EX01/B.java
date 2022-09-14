package chapter08.EX01;

//default : 같은 패키지 내에서만 접근, 다른 패키지에서는 접근 불가능

 class B {		// default 생략됨
	int a = 10;		//default
	int b = 20;		//default
	
	void print () {		//default
		System.out.println("B 클래스 접근");
	}

}
