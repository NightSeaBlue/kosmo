package basic1;

public class Ex03_for응용 {

	public static void main(String[] args) {
		// 알파벳 A 부터 Z 까지 출력
		for (char a = 'A' ; a<= 'Z' ; a++) {	// 대문자 A 가 아스키코드에서 65의 값을 보유하고 있기 때문에 ++의 연산이 가능
			System.out.print(a+ " ");
		}
		System.out.println();
		System.out.println("========================");
		
		for (int i = 1; i<=26; i++) {
			for (char a= 'A'; a <= 'Z' ; a++) {
				System.out.print(a+ " ");
			}
			System.out.println();
		}
		
		

	}

}
