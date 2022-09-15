package chapter09.EX04;

class Student02 {
	//  필드의 접근 제어자 : default로 구성됨 : -- 외부 클래스에서 객체 생성 후 직접 수정이 가능함
	static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
}

class Student03 {
	// 	필드의 접근 제어자는 보안을 위해서 private로 선언할 수 있다.
	//		-- 필드의 값 직접적으로 수정 불가능.
	//			--
	private static int serialNum = 1000;
	private int studentID;
	private String studentName;
	private int grade;		// 값 : 기본값으로 4학년 (1~4)
	private String address;
	private int month;		// 값 : 1~12 까지만 와야 한다.
	
	// 필드의 접근 제어자를 private로 설정시 외부 클래스에서 접근 불가능.
		// 생성자나 메소드 (Setter)를 사용해서 필드의 내용을 수정.
			// 원하는 값을 (제어해서) 입력을 할 수 있다.
	
	Student03 () {
		serialNum++;
		studentID = serialNum;
		grade = 4;
		address = "서울";
	}
	
	Student03 (String studentName) {
		this();		// 기본생성자 다시 호출
		this.studentName = studentName;
	}
	
	void print () {
		System.out.println("== 학생 정보 출력 ==");
		System.out.println("학생 ID : " + studentID);
		System.out.println("학생 이름 : " + studentName);
		System.out.println("학년 : " + grade);
		System.out.println("주소 : " + address);
		System.out.println("월 : " + month);
	}
	
	void setGrade (int grade) {		//setter : grade 필드의 값을 할당.
		if (grade >=1 && grade <=4) {
			this.grade = grade;
		} else {
			System.out.println(" 잘못된 값을 입력했습니다. 1~4 까지만 입력하세요. ");
			return;
		}
	}
	
	void setMonth (int month) {
		if (month >=1 && month <=12) {
			this.month = month;
		} else {
			System.out.println(" 잘못된 값을 입력했습니다. 1~12 까지만 입력하세요. ");
			return;
		}
	}
}

public class Student_Test02 {

	public static void main(String[] args) {
		
		// 객체 생성
		Student02 s2 = new Student02 ();
		
		// default 접근 제어자 : 동일한 패키지에 존재하는 클래스에서 필드의 값을 직접 수정
		s2.serialNum = 2000;
		s2.studentID = 100;
		s2.studentName = "홍길동";
		
		// 객체 생성 (private 선언으로 인해 외부 클래스에서 직접 호출 불가)
		Student03 s3 = new Student03 ();
//		s3.serialNum = 2000;
//		s3.studentID = 100;
//		s3.studentName = "홍길동";
		
		// 필드의 값을 직접 입력하는 경우는 넣는 값을 제어할 수 없다.
//		s3.grade = 100;		//1~4 private
//		s3.month = 200;		//1~12 private
		
		s3.setGrade(4);
		s3.setMonth(9);
		s3.print();
	}

}
