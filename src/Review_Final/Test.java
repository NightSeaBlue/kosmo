package Review_Final;

class Parent {
	 String field = "부모님";

	public void house () {
		System.out.println("부모님이 만드신 집");
	}
}

class Child extends Parent {

	Child () {
		// field = "자식 앞으로 명의 변경";  //field 에 final 이 선언되어 있으므로 변경 불가
	}

	public void house () {				// Super class 에서 Method가 final 선언 되었으므로, Overriding 불가
		System.out.println("집 차압 당함");
	}

}

public class Test {

	public static void main(String[] args) {

		Parent p = new Child ();
		System.out.println(p.field);
		p.house();

	}

}
