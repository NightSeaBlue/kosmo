package chapter05.EX02;

public class Using_Rectangle_Array01 {

	public static void main(String[] args) {
		
		
		//1. 2차원 배열 선언
		
		//2차원 배열 선언 / 초기화 [기본값 0이 모든 배열으로 들어가 자동으로 초기값이 생성됨]

		int [][] arr1 = new int [3][4];	//[3] : 행의 갯수 , [4] : 열의 갯수
		
		//2차원 배열 선언과 초기화를 분리 
		int [][] arr2;	//선언
		arr2 = new int [3][4] ; // 초기화 (if,while,do while)
		
		//2. 배열 변수 뒤에 [][]
		int arr3 [][] = new int [3][4];
		
		//3. 자료형과 변수에 각각 [] 적용
		int [] arr5 [] = new int[3][4];
		
		int [] arr6[];
		arr6 = new int[3][4];
		
		//4. 다양한 자료형의 배열 선언
		int [][] arr7 = new int [3][4];			//정수
		boolean [][]arr8 = new boolean[2][4];	//true,false
		double [][]arr9 = new double [4][5];	//실수
		String arr10[][] = new String [2][2];		//문자열
		
		
	}

}
