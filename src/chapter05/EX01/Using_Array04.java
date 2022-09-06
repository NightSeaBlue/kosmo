package chapter05.EX01;

import java.util.Arrays;

public class Using_Array04 {

	public static void main(String[] args) {
		
		
		// 배열 (Array) : 하나의 [배열] 변수 하나에 여러개의 값을 할당.
			 // - 참조 자료형 : 변수는 Stack에 저장., 값은 Heap 에 저장.
			 //		변수의 Heap 영역의 주소값이 들어있다.
			 // - 기본 자료형 : 변수, 값 모두 Stack에 저장되어 있다.
		     // 	boolean, byte, short, int, long, float, double, char
			// 기본 자료형 배열 변수 : 
			// 참조 자료형 배열 변수 : String
		
			//1. 동일한 자료형의 값을 담고 있다.
			//2. 방의 갯수를 변경할 수 없다. (정적)
		
			 // Heap 공간에는 반드시 값이 입력되어 있어야 함.
			 // 	- 초기값 미입력시 JVM이 값을 자동으로 넣음.
			 //		  -- 정수 : 0 , 실수 : 0.0 , boolean : false
			 // 	  -- 참조자료형일 경우 : null <== 0이 아닌 비어있는 상태
		
			//1. 배열 선언과 초기화
			int[] a = new int[5];
				//int 배열변수([]) a를 생성
				// new : Heap 공간에 int 배열 방 5개를 생성해서 Heap의 주소를 a변 후에 할당.
			
			//2. 방의 값을 입력
				//index (방) 직접 값을 대입.
			a[0] = 10;	// a[0] 공간에 10이라는 값을 할당.
			a[1] = 20;
			a[2] = 30;
			a[3] = 40;
			a[4] = 50;
			
			// 출력 (직접 출력)
			System.out.println("===== 직접 출력 =====");
			System.out.println(a[0]);	//index (방번호 0) 
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
			System.out.println(a[4]);
		
			
			System.out.println("=== for를 사용해서 값을 입력, 출력 ===");
			
			for (int i=0, j =100; i<5 ; i++,j+=100) {	//i : index를 의미(0,1,2,3,4)
				a[i] = j;
			}	// a[0] = 100, a[1] = 200,... a[4] = 500
			
			for (int i =0 ; i <5 ; i++) {
				System.out.println(a[i]);
			}
			
			System.out.println("==== a.length를 사용해서 입력, 출력 =====");
			System.out.println(a.length); //배열 방의 갯수를 출력
			for (int i=0, j =1000; i<5 ; i++,j+=100) {	//i : index를 의미(0,1,2,3,4)
				a[i] = j;
			}
			for (int i=0 ; i<5; i++) {
				System.out.println(a[i]);
			}

			//3. 배열 방의 정보를 출력 (Enhanced for : 배열에 저장된 모든 값을 출력.
			System.out.println("==== 향상된 for 문을 사용해서 출력 ====");
			for (int k : a) {
				System.out.println(k);
			}
			
			//4. 출력 : Arrays.toString(a)  : Arrays 객체의 toString() 메소드(함수)를 활용해 출력.
			System.out.println("==== Arrays.toString() 를 사용. ====");
			System.out.println(Arrays.toString(a));
			
			
	}

}
