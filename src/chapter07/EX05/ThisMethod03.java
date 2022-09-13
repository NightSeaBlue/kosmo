package chapter07.EX05;

class Book {
	String bookName;		//책이름
	String author;			//저자
	
	Book () {
		bookName = "책이름 없음";
		author = "작자미상";
	}
	
	Book (String bookName) {
		this();
		this.bookName = bookName;
	}
	
	Book (String bookName , String author) {
		this(bookName);
		this.author = author;
	}
	
	void print () {
		System.out.println("책의 이름은 : " +bookName);
		System.out.println("책의 저자는 : "+author);
	}
	
}

public class ThisMethod03 {	//메모리의 필드의 값을 출력해줌

	public static void main(String[] args) {
		
		//1. 기본 생성자 호출
		System.out.println("=== 아무 정보 모를 때 ===");
		Book book1 = new Book();
		book1.print();
		
		//2. 책 이름만 아는 경우
		System.out.println("=== 책 이름만 아는 경우 ===");
		Book book2 = new Book ("나의 라임오렌지 나무");
		book2.print();
		//3. 책 이름 저자명 다 아는 경우
		System.out.println("=== 모든 정보를 아는 경우 ===");
		Book book3 = new Book ("이방인", "알베르 카뮈");
		book3.print();
		
		System.out.println("=== 모든 정보를 아는 경우 ===");
		Book book4 = new Book ("어린 왕자", "생텍쥐페리");
		book4.print();
		
	}

}
