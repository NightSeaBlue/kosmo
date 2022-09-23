package review_Polymorphism;

public class MainTest {
	
	public static void main(String[] args) {
		
//		Book b = new Book ("15", "어린왕자", "생택쥐페리", "조은사") ;
//		Item b = new Book ("01", "노인을 위한 나라는 없다", "존 퀴삭", "버진");
		Book b = new Book ();
		Dvd d = new Dvd ("22","화양연화","양조위","주가복");
		Cd c = new Cd ("31","Piano man","Billy Joel");
		
		b.output();	// 인자가 있는 생성자를 만들었던걸 호출함으로 , 그 안에 있는 출력구문이 먼저 호출됨
		
	}

}
