package Review_singleton;

public class WorkA {
	
	DBConnect con;
	
	public WorkA () {
		//con = new DBConnect ();
		
		con = DBConnect.getInstance();
	}
	
	public void use () {
		System.out.println("A 작업");
	}

}
