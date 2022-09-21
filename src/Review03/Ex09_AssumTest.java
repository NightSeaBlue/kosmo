package Review03;

public class Ex09_AssumTest {

	public static void main(String[] args) {
		// 1 부터 내가 지정한 숫자만큼 합
		int sum = sumFunc(3);
		
		System.out.println("총 합 : "+sum);

	}
	
	static int sumFunc(int i) {
		// sum = 1+2+3			// 함수가 본인을 재호출 하는 것 : 재귀함수
		if (i==1) return 1;
		return i + sumFunc(i-1);
	}

}
