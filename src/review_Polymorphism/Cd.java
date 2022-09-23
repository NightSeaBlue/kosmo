package review_Polymorphism;

public class Cd extends Item{
	
	String singer ;	// 가수
	
	Cd () {
		this ("00","제목 없음","가수 모름");
		System.out.println("정보를 모르는 CD");
	}
	Cd (String num,String name,String singer) {
		//super.num = num; super.name = name;
		super(num,name);
		this.singer = singer;
		System.out.println("정보를 아는 CD");
	}
	
	@Override
	public void output() {
		System.out.println(num+" "+name);
		System.out.println(singer);
	}

}
