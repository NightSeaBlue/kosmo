package chapter10.EX06;

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
	@Override
	void run() {
		System.out.println("호랑이는 네 발로 달립니다.");
	}
	
	@Override
	void eat() {
		System.out.println("호랑이는 고기를 먹습니다.");
	}
}

class Eagle extends Animal {
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
	@Override
	void run() {
		System.out.println("개도 네 발로 달립니다.");
	}
	
	@Override
	void eat() {
		System.out.println("개는 아무거나 먹습니다.");
	}
}

public class Using_Method_Overriding03 {

	public static void main(String[] args) {
	Animal a = new Animal ();
	Animal t = new Tiger ();
	Animal e = new Eagle ();
	Animal f = new Fish ();
	Animal d = new Dog ();
	
	Animal [] arr = new Animal [] {a,t,e,f,d};
	System.out.println(" == for == ");
	for(int i=0;i<arr.length;i++) {
		arr[i].eat();
		arr[i].run();
	}
	
	System.out.println("== Enhanced For == ");
	for(Animal k : arr) {
		k.eat();
		k.run();
	}
	
	

	}

}
