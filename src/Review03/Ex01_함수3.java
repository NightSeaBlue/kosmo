package Review03;

public class Ex01_함수3 {
	public static void main(String[] args) {

		int [] result = add();

		int sum = result[0]+result[1];	//각 배열에 할당된 값을 직접 더함 (정수형)
		// for 문으로 합을 정의해 처리하는 경우
			/*for (int i = 0 ; i < result.length ; i++) {
					sum += result[i];
				}*/
		// a와 b의 값을 받아서 합한 결과를 여기서 출력
		System.out.println("합한 결과 : "+sum);
	}

	static int [] add () {
		int a = 10 , b = 20;
		int [] arr = {a,b};
		return arr;			// java의 return 은 반드시 하나의 타입만 반환 가능
	}
}
