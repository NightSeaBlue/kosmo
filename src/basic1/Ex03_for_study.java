package basic1;

public class Ex03_for_study {

	public static void main(String[] args) {
		// 문제 풀이
		
		//[1] A ... A to Z 출력하기
		for (int i =0 ; i <26; i++) {
			for (char a ='A' ; a<='A'+i ; a++) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		System.out.println("=====================");
		
		// [2] A to Z ... A 출력하기
		for (int i =0 ; i <26; i++) {
			for (char a ='A' ; a<='Z'-i; a++) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		System.out.println("=====================");
		
		// [3] A to Z .... Z 출력하기
		for (int i =0 ; i <26; i++) {
			for (char a =(char)('A'+i); a<='Z'; a++) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		System.out.println("=====================");
		
		// [4] Z.... Z to A 출력하기
		for (int i =0 ; i <26; i++) {
			for (char a ='Z' ; a>='Z'-i; a--) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		System.out.println("=====================");
		
		// [5] A to Z ... Z 출력하기
		for (int i =0 ; i<26; i++) {
			for (int j=0; j<=i ; j++) {
				System.out.print(" ");
			}
			for (char a =(char)('A'+i) ; a<='Z';a++) {
				System.out.print(a);
			  }
			System.out.println();
		}
		System.out.println("=====================");

	}

}
