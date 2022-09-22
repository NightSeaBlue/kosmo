package Review_singleton;

//* Singleton Pattern "모든 클래스에서 객체를 단 하나만 생성할 수 있는 패턴"

public class DBConnect {

	private DBConnect () {
		System.out.println("실제 디비 연결");
	}

	private static DBConnect con = null;		// DBConnect 필드 내에서만 사용 가능한 필드변수 선언

	public static DBConnect getInstance () {
		if(con==null) {
			con = new DBConnect();
		}
		return con;
	}

}
