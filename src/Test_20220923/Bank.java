package Test_20220923;

public class Bank  {
	
	String 예금주;
	String 계좌번호;
	int 잔액 ;
	int cash;
	public void deposit (int cash) {	// 입금 메소드 생성
		this.cash = cash;	// 입금한 금액이 인자일 때 해당 인자를 메소드 내 변수에 할당.
		잔액+=cash;			// 잔액에 입금한 금액 추가
		System.out.println("입금한 금액은 " + cash+"원 입니다.");	// 입금액 출력
	}
	
//	public int deposit (int cash) {
//		this.cash = cash;
//		잔액+=cash;
//		System.out.println("입금 금액 : "+cash+"원");
//		return cash;
//	}
	
	public void withdrawl (int cash) {
		this.cash = cash;	// 인출할 금액이 인자일 때 해당 인자를 메소드 내 변수에 할당
		잔액-=cash;			// 잔액에서 인출 금액 차감
		if (잔액 < 0) {		// 잔액이 출금액보다 부족할 경우 잔액 부족 출력
			System.out.println("잔액이 부족합니다.");
		} else {			// 잔액이 출금액보다 클 경우 , 출금액 출력
			System.out.println("인출한 금액은 "+cash+"원 입니다.");
		}
		
	}
	
	@Override
	public String toString() {
		return "Bank [예금주=" + 예금주 + ", 계좌번호=" + 계좌번호 + ", 잔액=" + 잔액 + "]";
	}

}
