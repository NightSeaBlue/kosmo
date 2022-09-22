package Review_singleton;

public class WorkB {
	
	DBConnect con;
	
	public WorkB () {
		//con = new DBConnect ();
		con = DBConnect.getInstance();
	}
	
	public void use () {
		System.out.println("B작업");
	}

}
