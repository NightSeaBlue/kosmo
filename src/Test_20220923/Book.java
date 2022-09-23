package Test_20220923;

public class Book {

	String name;
	String author;
	String publisher;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		publisher = publisher;
	}
	
	Book (String name ,String author , String publisher) {
		this.name=name; this.author = author; this.publisher=publisher;
	}
	
	 void output () {
		 System.out.println("책 제목 : "+getName());
		 System.out.println("책 저자 : "+getAuthor());
		 System.out.println("책 출판사 : "+getPublisher());
	 }


}


