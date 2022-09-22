package Review04;

public class Student {		// 서로 다른 정보를 한 방에 묶는 것

	private String hakbun;
	private String name;
	private int kor,eng,math;
	private int total;
	private double avg;

	public Student () {		// 기본 생성자 : 만일 입력하지 않을 경우 , 컴파일러가 Auto Making
		// this.name = "이름 없음";
		// this.kor = 50;
		// this.eng = 50;
		// this.math = 50;
		this ("이름없음",50,50,50);	// 생성자 호출은 반드시 맨 앞줄에 위치해야 함.
		System.out.println("기본 생성자");
	}		

	public Student (String name , int kor , int eng , int math) {	// 임의로 생성자 함수를 만들 경우 , 컴파일러가 기본 생성자를 생성해주지 않음
		this.name = name ; this.kor = kor ; this.eng = eng; this.math = math;
		System.out.println("인자를 보유한 생성자");
	}

	/*public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}*/

	public void calTotal () {
		total = kor + eng + math;
	}

	public void calAvg () {
		avg = total / 3 ;
	}

	public void output () {
		System.out.println(name+"의 성적은 "+ total + " 평균은 "+avg+" 입니다.");
	}

}

// 배열 : 서로 같은 정보를 한 방에 묶는 것

/*
 * 
 * 	캡슐화
 * 		- 멤버 변수 (field) : private
 * 		- 멤버 메소드 (method) : public
 * 
 * 
 */