package chapter07.EX04;

class Car {
	
	//1. 필드
	String company;		// 제조사
	String model;		// 모델 명
	String color;		// 차량 색상
	double maxSpeed;	// 차량 최고 속도
	
	//2. 생성자
	Car () {}
	Car (String company , String model, String color, double maxSpeed) {
		this.company = company; this.model =model; this.color = color; this.maxSpeed = maxSpeed;
	}
	//3. 메소드 (show () : 필드 값 출력
	void show () {
		System.out.println(company + " , "+ model+ " , "+ color + " , "+maxSpeed);
	}
	//4. 메소드 (getter/setter)
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}


public class Car_Test {

	public static void main(String[] args) {
		// 객체 생성
		// car1  현대자동차 그랜져 <== 필드 값 직접 입력/출력
		Car car1 = new Car ();
		car1.company = "현대자동차"; car1.model = "그랜져"; car1.color = "로맨틱실버"; car1.maxSpeed = 250;
		System.out.println(car1.company + " , "+car1.model + " , "+car1.color + " , "+car1.maxSpeed);
		
		// car2  쌍용자동차 체어맨 <== 생성자 통해 값 입력 후 show()로 출력
		Car car2 = new Car ("쌍용자동차", "체어맨" , "매너리즘블랙" , 200);
		car2.show();
		// car3  기아자동차 k9 <== settr/getter
		Car car3 = new Car ();
		car3.setCompany("기아자동차"); car3.setModel("K9"); car3.setColor("시프트화이트"); car3.setMaxSpeed(270);
		System.out.println(car3.getCompany()+" , "+car3.getModel()+ " , "+car3.getColor() + " , "+car3.getMaxSpeed());

	}

}
