package review_Polymorphism;

public class Book extends Item{
	
	String author ;	// 저자
	String publisher ;	// 출판사
	
	Book () {
		this ("00","제목 없음","저자 미상","출판사 미상");
		System.out.println("정보를 모르는 저서");
	}
	
	Book (String num, String name,String author , String publisher) {
		//super.num = num; super.name = name;
		super(num,name);
		this.author = author; this.publisher = publisher;
		System.out.println("정보를 아는 저서");
	}
	
	@Override
	public void output() {
		System.out.println(num+" "+name);
		System.out.println(author+" "+publisher);
	}

}
