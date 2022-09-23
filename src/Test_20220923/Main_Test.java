package Test_20220923;

public class Main_Test {
	
	public static void main(String[] args) {
		// 문제에 대한 결과 출력
		Bank b = new Bank();		// 객체 생성
		b.예금주 = "자바맨"; b.계좌번호 = "123-456"; b.잔액 = 1000;
		System.out.println(b.toString());
		b.deposit(2000);	// 입금 메소드
		b.withdrawl(4000);	// 출금 메소드
	}
	

}
