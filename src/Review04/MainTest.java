package Review04;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 값지정 No.1 Setter
		Student s = new Student ();		// 호출 하기 전 새로이 객체로 지정
		
		/*s.setName("홍길동");
		s.setKor(100);
		s.setEng(30);
		s.setMath(55);*/ 
		
		// 값지정 No.2 생성자
		//Student s = new Student ("홀란드", 99 , 95, 100);
		
		s.calTotal();
		s.calAvg();
		//s.total = 0; // capsulation으로 값의 변동을 막음
		s.output();
		

	}

}
