package c_collection;
import java.util.HashSet;

public class bHashSetEx 
{
	public static void main(String[] args)
	{
		HashSet <String> set = new HashSet <String> ();
		set.add("rabbit");
		set.add("zebra");
		set.add("fox");
		set.add("zebra");
		set.add("elephant");
		set.add("elephant");	// 순서를 저장하지 않고 중복되는 값을 저장하지 않음.
		
		System.out.println( set );		
	}
}
