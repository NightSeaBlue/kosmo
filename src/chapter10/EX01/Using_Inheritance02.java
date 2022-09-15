package chapter10.EX01;

class Fruit {	// 과일 : 부모 클래스
	String name ;	// 과일 이름
	String color ;	// 과일 색깔
	int large ;		// 과일 크기
	
	void eat () {
		System.out.println("모든 과일은 맛이 있습니다.");
	}
	
	void print () {
		System.out.println(" == 과일 정보 출력 ==");
		System.out.println(name + " , "+color+ " , "+large);
	}
	
}

class Apple extends Fruit {	// 사과 : 자식 클래스
	// 자식 클래스만 가지는 필드 1, 메소드 1
	String age;
	
	void fruty (String age) {
		this.age = age;
		System.out.println("수확 후 숙성정도 : "+age);
	}
}

class Orange extends Fruit {	// 오렌지 : 자식 클래스
	// 자식 클래스만 가지는 필드 1, 메소드 1
	int brix;
	
	void Brix (int brix) {
		this.brix = brix;
		System.out.println("오렌지의 당도 : "+brix);
	}
}

class Banana extends Fruit {	// 바나나 : 자식 클래스
	// 자식 클래스만 가지는 필드 1, 메소드 1
	int count;
	
	void Count (int count) {
		this.count = count;
		System.out.println("과실의 갯수 : "+count);
	}
}



public class Using_Inheritance02 {

	public static void main(String[] args) {
		// 호출 후 출력
		
		Fruit f = new Fruit ();
		
		f.name = "용과";
		f.large = 17;
		f.color = "연두색";
		
		f.print();
		f.eat ();
		
		Apple a = new Apple ();
		
		a.name = "사과";
		a.large = 11;
		a.color = "붉은색";
		a.age = "미숙";
		
		a.print();
		a.eat();
		a.fruty(a.age);
		
		Orange o = new Orange ();
		
		o.name = "오렌지";
		o.large = 20;
		o.color = "주황색";
		o.brix = 14;
		
		o.print();
		o.eat();
		o.Brix(o.brix);
		
		Banana b = new Banana () ;
		
		b.name = "바나나";
		b.large = 17;
		b.color = "노란색";
		b.count = 10;
		
		b.print();
		b.eat();
		b.Count(b.count);

	}

}
