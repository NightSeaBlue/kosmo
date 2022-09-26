package c_collection;
import java.util.*;

public class bHashSetLottoEx 
{
	public static void main(String[] args) 
	{
		HashSet <Integer> lottos = new HashSet <Integer> ();	//Set의 경우 중복값이 할당되지 않음.
		
//		for (int i =  0  ; i < 6 ; i++) {
//			int num = (int)(Math.random()*45)+1;	// 정수타입 변수 num 에 정수 할당
//			lottos.add(num);	// lottos 라는 동적 배열에 값 할당 
//		}
		
		while (lottos.size() <6) {	// 배열의 크기가 6이 될 때까지 값 할당.
			int num = (int)(Math.random()*45)+1;
			lottos.add(num);
		}
		
		System.out.println(lottos);
		
		ArrayList <Integer> list = new ArrayList <Integer> (lottos);		// ArrayList 를 활용해 Set을 List화 시킴
		Collections.sort(list);	// 정렬을 위해 Collection.sort 메서드 활용 . Collection.sort 의 경우 List만 위치할 수 있으므로, Set을 List화 시켜야함
		System.out.println(list);


		
	}
}
