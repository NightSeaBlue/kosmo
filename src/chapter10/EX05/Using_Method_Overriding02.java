package chapter10.EX05;

class Animal {
	void cry () {
		System.out.println("모든 동물은 웁니다.");
	}
}

class Bird extends Animal {
	@Override
	void cry () {
		System.out.println("짹짹");
	}
	
}


class Cat extends Animal {
	@Override
	void cry () {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	@Override
	void cry () {
		System.out.println("멍멍");
	}
	
}


public class Using_Method_Overriding02 {

	public static void main(String[] args) {
		// 1. 각각의 타입으로 선언 + 각각의 타입으로 생성
		Animal aa = new Animal ();
		Bird bb = new Bird ();
		Cat cc = new Cat ();
		Dog dd = new Dog ();
		
		aa.cry();		// aa.cry() : Animal 의 cry() 를 호출
		bb.cry();		// bb.cry() : Bird 의 cry() 를 호출
		cc.cry();		// cc.cry() : Cat 의 cry() 를 호출
		dd.cry();		// dd.cry() : Dog 의 cry() 를 호출
		
		System.out.println("=============================");
		
		// 2. Animal 타입으로 선언 + 자식 클래스로 객체 생성
			// 자식의 객체를 생성할 때 부모 타입으로 정의 후 부모의 메소드를 호출 시 오버라이딩된 메소드 출력
				// 오버라이딩을 사용해서 하나의 타입으로 정의, 배열이나 컬렉션에 저장해서 관리를 쉽게 할 수 있다.
		
		Animal aa1 = new Animal ();
		Animal bb1 = new Bird ();
		Animal cc1 = new Cat ();
		Animal dd1 = new Dog ();
		
		aa1.cry();	// aa1.cry() : Animal 의 cry ()를 호출
		bb1.cry();	// bb1.cry() : Animal 의 cry ()를 호출 ==> 오버라이딩 된 메소드 출력
		cc1.cry();	// cc1.cry() : Animal 의 cry ()를 호출 ==> 오버라이딩 된 메소드 출력
		dd1.cry();	// dd1.cry() : Animal 의 cry ()를 호출 ==> 오버라이딩 된 메소드 출력
		
		//Animal 타입으로 선언이 되어 있으므로 배열이나 컬렉션에 넣어서 아주 쉽게 관리
		// 배열의 특징: 1. 동일한 타입을 저장 , 2. 방의 크기가 선언되면 바꿀 수 없다.
		
		int [] arr1 = new int [5] ;				// 배열의 방 크기 지정후 값을 할당.
		int [] arr2 = new int [] {1,2,3,4};		// 배열 선언과 동시에 값을 할당.
		// 타입 [] 배열변수 =
		
		// 객체를 배열에 저장 : Animal 객체를 배열에 저장
		System.out.println("=== 객체를 배열에 저장 후 출력 ===");
		Animal[] arr3 = new Animal [] {aa1,bb1,cc1,dd1};
		
		//for 문을 사용해서 출력
		System.out.println("== For 문으로 출력 ==");
		for (int i = 0; i<arr3.length ; i++) {
			arr3[i].cry();	//Animal 의 cry()를 호출시 객체에서 오버라이딩 된 메소드가 출력
		}
		
		//향상된 for 문을 사용해서 출력
		System.out.println("== 향상된 For ==");
		for (Animal k : arr3) {
			k.cry();
		}
		
		

	}

}
