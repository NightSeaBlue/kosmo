package Review02;

public class Ex01_while개념 {

	public static void main(String[] args) {
		
		
		// 0. for 문
		/*int sum=0;
		for (int i = 0 ; i<11 ; i++) {	//1부터 10까지, i를 계속 1씩 증가시켜 더한다.
			sum+=i;
		}
		System.out.println("1부터 10까지의 합 : "+sum);*/
		
		// while 을 활용해 문장 수정 (초기치를 반복블록 위로 , 증가치를 반복문 끝으로)
		// 조건문만 남아서 for -> while 문으로 변경
		/*int sum = 0;
		int i = 0;
		while (i<11) {	// i 가 0 이고 i가 11보다 작을 때 , 즉 1부터 10까지
			sum+=i;			// 증가된 i의 값을 sum에 합한다.
			i++;		// i 를 1씩 증가
		}
		System.out.println("1부터 10까지의 합 : "+sum); */
		
		// 2. do ~while
		int sum = 0;
		int i = 0;
		do {
			sum+=i;
			i++;
		} while (i<11);
		System.out.println("1부터 10까지의 합 : "+sum);

	}

}
