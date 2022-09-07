package chapter05.EX04;

import java.util.Arrays;

public class Using_String03 {

	public static void main(String[] args) {
		// String VS 다른 참조 자료형 비교.
		// String에 저장된 값은 수정이 불가, 새로운 값이 힙영역에 생성됨.
		
		
		//1. String (객체의 내용 변경이 불가능 ==> 새로운 객체 생성됨)
		String str1 = new String("안녕");
		String str2 = str1;			// Stack 영역의 객체 주소를 복사함.
		
		System.out.println(str1==str2);	//true
		System.out.println(str1);		//안녕
		System.out.println(str2);		//안녕
		
		str1 = "안녕하세요";					// 별도의 메모리 공간에 새롭게 생성함.
		System.out.println(str1==str2);		// 변수를 수정하는 것이 아닌 별도의 공간에 str1 값 새로 할당.
		System.out.println(str1);
		System.out.println(str2);
		
		//2. 다른 참조 자료형인 경우는 수정이 된다.	(배열)
		int [] arr1 = new int [] {3,4,5};
		int [] arr2 = arr1;					// arr1 참조변수의 주소를 복사해서 arr2에 저장 (Stack 값을 복사)
		
		
		// 값을 수정시
		arr1 [0] = 6;
		arr1 [1] = 7;
		arr1 [2] = 8;
		
		//주소가 같은지 확인
		System.out.println(arr1 == arr2);	// Stack의 주소 비교
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
	}

}
