package c_collection;
import java.util.TreeSet;

public class bTreeSetEx 
{
	public static void main(String[] args) 
	{
		TreeSet <String> set = new TreeSet <String> ();		// Tree 구조, 자동으로 값을 정렬하는 배열
		
		set.add("elephant");
		set.add("tiger");
		set.add("lion");
		set.add("cat");
		set.add("dog");
		set.add("ant");
		set.add("snake");
		set.add("zebra");
		set.add("bee");

		System.out.println( set );
		System.out.println(set.subSet("d", "s"));	// d 부터 s 앞까지
		System.out.println(set.headSet("e"));		// e 의 앞까지
		System.out.println(set.tailSet("e"));		// e 부터 끝까지
		

	}
}
