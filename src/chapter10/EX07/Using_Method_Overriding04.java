package chapter10.EX07;

class Animal {
	// 자식 클래스에서 2개의 메소드 오버 라이딩.
	// Animal 타입으로 정의, 배열에 저장 후, 오버라이딩 된 메소드 출력 (For, Enhanced For)
	
	void run() {
		System.out.println("모든 동물은 달립니다.");
	}
	
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
}

class Tiger extends Animal {
	// 생성자 : 정수를 인풋 받아서 count 필드에 값을 할당.
	int count;
	Tiger (int count) {
		this.count = count;
	}
	@Override
	void run() {
		System.out.println("호랑이는 네 발로 달립니다.");
	}
	
	@Override
	void eat() {
		System.out.println("호랑이는 고기를 먹습니다.");
	}
	
	void count (int count) {
		this.count = count;
	}
}

class Eagle extends Animal {
	int count;
	Eagle (int count) {
		this.count = count;
	}
	@Override
	void run() {
		System.out.println("독수리는 하늘을 납니다.");
	}
	@Override
	void eat() {
		System.out.println("독수리는 시체를 먹습니다.");
	}
	
}

class Fish extends Animal {
	int count;
	Fish (int count) {
		this.count = count;
	}
	@Override
	void run() {
		System.out.println("물고기는 헤엄을 칩니다.");
	}
	@Override
	void eat() {
		System.out.println("물고기는 해산물을 먹습니다.");
	}
	
	
}

class Dog extends Animal {
	int count;
	Dog (int count) {
		this.count = count;
	}
	@Override
	void run() {
		System.out.println("개도 네 발로 달립니다.");
	}
	
	@Override
	void eat() {
		System.out.println("개는 아무거나 먹습니다.");
	}
	
}

public class Using_Method_Overriding04 {

	public static void main(String[] args) {
		// 1. 객체 생성
			// 1. 객체 생성 (Animal 타입으로 생성)
				// 생성자를 통해서 각가의 필드에 값을 할당.
		
		Animal a = new Animal ();
		Animal t = new Tiger (10);
		Animal e = new Eagle (5);
		Animal f = new Fish (50);
		Animal d = new Dog (70);
		
			// 객체를 배열에 저장
		Animal [] arr = new Animal [] {a,t,e,f,d};
		
		//For 문을 사용해서 출력 : eat() , run() , 동물의 총 마릿수 : 00
			// 1. For 문을 사용해서 객체를 Animal 객체로 뽑아서
			// 2. 다운캐스팅 해서 자식 필드의 count 값 읽어서 총 더한 값을 출력.
		
		//동물의 총 합을 구하는 변수 선언
		int sum = 0;
		
		for (int i = 0; i<arr.length ; i++) {
			// 배열의 각 방에 저장된 객체를  Animal 객체에 저장.
			Animal aa = arr[i];
			aa.eat();	// Animal의 eat() 메소드 : 오버라이딩 된 메소드 출력
			aa.run();	// Animal의 run() 메소드 : 오버라이딩 된 메소드 출력
			
			if (aa instanceof Tiger) {
				Tiger t1 = (Tiger) aa;
				System.out.println("호랑이의 마릿수 : " + t1.count);
				sum+=t1.count ;
			} else if (aa instanceof Eagle) {
				Eagle e1 = (Eagle) aa;
				System.out.println("독수리의 마릿수 : " + e1.count);
				sum+=e1.count ;
			} else if (aa instanceof Fish) {
				Fish f1 = (Fish) aa;
				System.out.println("물고기의 마릿수 : " + f1.count);
				sum+=f1.count;
			} else if (aa instanceof Dog) {
				Dog d1 = (Dog) aa;
				System.out.println("개의 마릿수 : " + d1.count);
				sum+=d1.count;
			}
			
			}
				System.out.println("동물의 마릿수 총 합은 "+sum+" 마리 입니다." );
		}

	}


