package chapter09.EX04;

class Student {
	
	static int serialNum = 1000;	// 모든 객체에서 공유하는 필드, 객체를 생성할 때 마다 1씩 증가
	int studentID;		// 학생 고유 ID :
	String studentName;	// 학생 이름
	int grade;			// 학년 : 기본 값으로 4 학년
	String address;		// 주소 : 기본 값으로 "서울"
	
	Student () {
		studentID = serialNum;
		grade = 4;
		address = "서울";
	}
	
	Student (String studentName) {
		this.studentName = studentName;
		grade = 4;
		address = "서울";
		this.studentID = ++serialNum;
	}
	
	void print () {
		System.out.println("== 학생 정보 출력 ==");
		System.out.println(" 학생 이름 : " +studentName);
		System.out.println(" 학년 : "+grade);
		System.out.println(" 주소 : "+address);
		System.out.println(" 학생 ID : "+studentID);
		System.out.println();
	}
	
	
}

public class Student_Test {

	public static void main(String[] args) {
		
		// 
		// 객체 생성시 자동으로 학번이 1000번부터 1씩 자동으로 증가됨.
		// studentID : 1000 부터 학생 객체를 생성할 때 마다 고유한 값으로 적용 되어 있어야 한다.
		
		Student lee = new Student ("이지원");		//1001
		lee.print();
		
		Student hong = new Student ("홍지원");	//1002
		hong.print();
		
		Student jung = new Student ("정지원");	//1003
		jung.print();
		
		Student park = new Student ("박지원");	//1004
		park.print();
		
		Student choi = new Student ("최지만");
		choi.print();

	}

}
