package Review05;

public class Book {
	private static int count;
	
	public Book() {
		count++;
	}
	
	public static int getCount () {		//Method 에 static 이 붙을 경우, class 명 접근 가능
		return count;
	}
	

}


/*
 * 	static
 * 
 * 	- 객체의 공유
 * 	= 객체 생성보다 먼저 실행하기 때문에 클래스명 접근
 * 
 * */
