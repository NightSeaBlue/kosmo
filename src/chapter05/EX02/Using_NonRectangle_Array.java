package chapter05.EX02;

public class Using_NonRectangle_Array {

	public static void main(String[] args) {
		
		// 비정방형 배열 : 각 행에 대해서 열의 갯수가 다를 때
		
		// 1. 방법 1 : 비정방형 배열 선언 후 방 크기 및 값 할당.
		int [][] arr1 = new int [2][];	//행의 갯수만 지정
		arr1[0] = new int [2];	// 0번째 행의 열의 갯수를 지정
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		
		arr1[1] = new int [3];	//1번째 행의 열의 갯수를 지정
		arr1[1][0] = 3;
		arr1[1][1] = 4;
		arr1[1][2] = 5;
				
		System.out.println(arr1[0][0] + " " + arr1[0][1]);
		System.out.println(arr1[1][0] + " " + arr1[1][1] + " " + arr1[1][2]);
		System.out.println("==========================================");
		
		// 2. 방법 2 : 비정방형 배열을 선언 시 값 할당.
		int [][]arr2 = new int[2][];	//비정방형 배열 선언 : 행의 갯수만 선언, 열 미선언.
		arr2[0] = new int[] {1,2};		// 0행의 값을 바로 할당. (주의 : 방 크기 지정시 오류 발생)
		arr2[1] = new int[] {3,4,5};	// 1행의 값을 바로 할당.
		System.out.println(arr2[0][0] + " " + arr2[0][1]);
		System.out.println(arr2[1][0] + " " + arr2[1][1] + " " + arr2[1][2]);
		System.out.println("=================================");
		
		// 3. 방법 3 : 비정방형 배열 선언시 값 할당.
		int[][]arr3 = new int[][] {{1,2} ,{3,4,5}};
		System.out.println(arr3[0][0] + " " + arr3[0][1]);
		System.out.println(arr3[1][0] + " " + arr3[1][1] + " " + arr3[1][2]);
		System.out.println("=================================");
		
		// 선언 및 초기화 분리
		int [][] arr4 ;
		arr4 = new int [][] {{1,2} ,{3,4,5}};
		System.out.println(arr4[0][0] + " " + arr4[0][1]);
		System.out.println(arr4[1][0] + " " + arr4[1][1] + " " + arr4[1][2]);
		System.out.println("=================================");
		
		//3. 방법 4 : 비정방형 배열 선언시 값을 할당. (선언과 초기화 분리 불가능)
		int [][]arr5 = {{1,2}, {3,4,5}};
		System.out.println(arr5[0][0] + " " + arr5[0][1]);
		System.out.println(arr5[1][0] + " " + arr5[1][1] + " " + arr5[1][2]);
		System.out.println("=================================");
		
		//오류 발생 : 선언과 초기화 분리시 오류 발생
		int [][] arr6;
		//arr6 = {{1,2}, {3,4,5}};	//오류 발생

	}

}
