package Review02;

/*
 * [문제]
 * 
 * 1부터 50까지 숫자 중에서 3,6,9 숫자가 포함되면 
 * 그 갯수만큼 '짝'을 출력하고
 * 그렇지 않으면 그 숫자를 출력
 * 
 * ex)26
 * 
 */

public class Ex03_369 {

	public static void main(String[] args) {

		for(int i =1 ; i <=50; i++) {
			int su = i;
			boolean su369 = false;	//임의의 논리변수 설정
			
			while (su!=0) {
			int na = su%10;	// 10 의 자리와 1의 자리 분리를 위한 계산
			if (na==3|na==6|na==9) {
				System.out.print("짝");	// 나머지가 3,6,9 일경우 짝을 출력
				su369 = true;		// 짝에 대한 논리변수 true
			}
			su = su/10;	// 10의 자리 값 계산을 위한 몫 분리
			}
			if(su369)System.out.println();	// 논리변수가 true 일 때 개행
			else System.out.print(i+" ");	// 논리변수가 false 일 때 숫자와 공백 출력
			
		
		}
		
		
		
	}

}
