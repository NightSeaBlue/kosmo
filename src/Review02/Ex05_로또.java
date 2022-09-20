package Review02;

/*
  	int a = 5 , b = 10;

	int temp;

  	temp = a;
  	a = b;
  	b = temp;

 */

/*
 * 
 * Math.random() : 0.0 <= 소수 점수 <1.0
 * 
 * ex) 0.1234
 * 	   0.00123
 *     0.5673
 *     0.999999
 *     
 * (int)(Math.random()*10)
 * 
 *     ex) 1.234 => 1
 * 		   0.0123 => 2
 * 		   5.673 => 5
 * 		   9.99999	=> 9
 * 
 * 
 * */


public class Ex05_로또 {

	public static void main(String[] args) {
		// 숙제 Random 의 중복값 제거

		// 값 지정
		int [] lotto = new int [6];
		for (int i=0; i <lotto.length; i++) {
			lotto[i] = (int) (Math.random()*45)+1;
			// 중복값 제거
			/*for (int j=0 ; j < i ; j++) {
				if (lotto[i]==lotto[j]) {
					i--;
				}
			}*/
		}

		// 정렬 (Bubble - sort)
		for (int i = lotto.length-1 ; i > 0 ; i-- ) {	// i의 크기가 lotto 행렬의 크기보다 1 작을 때, i 가 0보다 클경우 , i를 1씩 감소시키며 반복
			for (int j = 0 ; j<i ; j++ ) {	// j의 크기가 0이고 j 가 i 보다 작을 때 j를 1씩 증가
				if(lotto[j]> lotto[j+1]) {	// j열의 방의 값의 크기가 j+1 방의 값 보다 클 경우
					int temp = lotto[j];	// 임의의 변수 temp에 j번 방 값 할당 (값의 수정을 위한 할당)
					lotto[j] = lotto[j+1];	// j번 방의 값에 j+1번 방 값 할당
					lotto[j+1] = temp;		// j+1 번 방 값에 temp 값 할당 (즉 j 번방 값 할당)
				}
			}
		}

		// 번호 출력
		for (int i = 0 ; i<lotto.length;i++) {
			System.out.print(lotto[i]+"/");
		}
		System.out.println();


	}

}




