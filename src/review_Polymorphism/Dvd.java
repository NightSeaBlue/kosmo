package review_Polymorphism;

public class Dvd extends Item{
	
	String actor ;	// 배우
	String director ;	// 감독
	
	Dvd () {
		this ("00","제목 없음","배우 미상","감독 미상");
		System.out.println("정보를 모르는 DVD");
	}
	Dvd (String num, String name,String actor, String director) {
		//super.num = num; super.name = name;
		super(num,name);
		this.actor = actor; this.director =director;
		System.out.println("정보를 아는 DVD");
	}
	
	@Override
	public void output () {
		System.out.println(num+" "+name);
		System.out.println(actor+" "+director);
	}

}
