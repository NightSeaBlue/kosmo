package c_collection;

import java.util.ArrayList;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) 
	{
		ArrayList <String>  list = new ArrayList <String> (4);
		list.add("rabbit");  
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		// 노랜표시 없애려면 generics 지정 :<type>	// 원하는 타입의 동적 배열 생성 
		
		list.set(3, "rat");
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		Collections.sort(list);
		
		
		
//		System.out.println("== for ==");
//		for (int i =  0 ; i< list.size(); i++) {
//			String data = (String) list.get(i);		// ArrayList 의 경우 object 타입으로 객체를 가져오기 때문에 , 변수로 받을 경우, 원하는 자료형 지정 필요
//			System.out.println(data);
//		}
//		
//		System.out.println("== for each ==");
//		for (String data : list) {
//			System.out.println(data);
//		}
		

	}
}
