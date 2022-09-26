package c_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

//----------------------------------------------------------
class Student extends Object {
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name +"학생은 " +  age + "세 입니다.";
	}
}


public class aArrayListEx3 {

	public static void main(String[] args) {
		ArrayList <Student> result = method ();	//변수 지정시 타입 잘 보고 만들기, method의 타입이 list <Student> 임
		// 학생 정보를 여기서 출력하시오
		for (Student s : result) {
			System.out.println(s);
		}
		
		// [참고] 전체 요소를 순서대로 검색
		// 		 Enumeration -> Iterator
		System.out.println("-------------------------");
		Iterator <Student> it = result.iterator();	// 순서대로 요소를 출력해 내는 Method
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	
	}
	
	static ArrayList <Student> method () {
		ArrayList <Student> list = new ArrayList <Student> ();
		list.add(new Student ("홍길자",25));		// 변수를 생성할 때 new를 이용해 값을 한번에 할당 할 수 있음 , 따로 생성자를 호출해 값을 입력할 필요 없
		list.add(new Student ("홍길이",33));
		list.add(new Student ("홍삼이",44));
		
		return list;
		
		
	}

}


