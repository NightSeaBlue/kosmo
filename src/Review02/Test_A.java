package Review02;

public class Test_A {
	public static void main(String[] args) {
		// 문제  A
		int count = 0;		// 갯수에 해당하는 임의의 변수 할당
		for (int i = 1 ; i<=10000; i++) { // 10000까지 i를 1씩 증가, 10000회 반복
			int su = i;	// 증가하는 i 값을 받아줄 임의의 변수
			
			while (su!=0) {
				int na = su % 10;	//변수 su 를 10의 자리와 1의 자리 분리
				if (na == 8) {	// 1의 자리가 8에 해당할 경우
					count++;	// 갯수 1씩 증가	
				}
				su=su/10;		// 변수 su의 10의 자리 분리 (10,000까지 반복)
			}
		}
		System.out.println("1~10000 사이 8의 갯수 : "+count);		//결과
				
	}
}
