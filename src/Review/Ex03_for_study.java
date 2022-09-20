package Review;

public class Ex03_for_study {

	public static void main(String[] args) {
		// 문제 풀이
		
		//[1] A ... A to Z 출력하기
		for (int i =0 ; i <26; i++) {	// 알파벳 A to Z 까지 갯수 26, 26회 반복
			for (char a ='A' ; a<='A'+i ; a++) { //점차 a의 수를 증가시킴 / A , A B , A B C ....
				System.out.print(a+" ");
			}
			System.out.println();
		}
		System.out.println("=====================");
		
		// [2] A to Z ... A 출력하기
		for (int i =0 ; i <26; i++) {
			for (char a ='A' ; a<='Z'-i; a++) {	// a를 A to Z 에서 부터 A까지 점차 감소 시킴 / A to Z / A to Y ... A
				System.out.print(a+" ");
			}
			System.out.println();
		}
		System.out.println("=====================");
		
		// [3] A to Z .... Z 출력하기
		for (int i =0 ; i <26; i++) {
			for (char a =(char)('A'+i); a<='Z'; a++) {	//	a의 할당값을 1씩 증카시키게 받아 다음과 같이 나열 / A to Z / B to Z .... Z
				System.out.print(a+" ");
			}
			System.out.println();
		}
		System.out.println("=====================");
		
		// [4] Z.... Z to A 출력하기
		for (int i =0 ; i <26; i++) {
			for (char a ='Z' ; a>='Z'-i; a--) { // a 에 Z를 할당시키고 i씩 감소하는 값보다 같거나 클 경우, a를 1씩 감소시켜, 그 결과값을 출력 Z / Z Y ... Z to A
				System.out.print(a+" ");
			}
			System.out.println();
		}
		System.out.println("=====================");
		
		// [5] A to Z ... Z 출력하기
		for (int i =0 ; i<26; i++) {	// i는 A to Z 즉 26회 반복
			for (int j=0; j<=i ; j++) {	// j를 i보다 같거나 작게 할당하고, 이럴 경우 공백을 출력 / 이 때 공백도 하나의 문자열
				System.out.print(" ");
			}
			for (char a =(char)('A'+i) ; a<='Z';a++) {	// a 에 A 부터 i씩 증가하게끔 값을 할당 해, Z 보다 같거나 작으면 이를 1씩 증가시켜 출력
				System.out.print(a);
			  }
			System.out.println();
		}
		System.out.println("=====================");

	}

}
