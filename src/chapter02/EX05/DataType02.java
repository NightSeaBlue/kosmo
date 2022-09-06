package chapter02.EX05;

public class DataType02 {

	public static void main(String[] args) {
		//float 과 double의 정밀도 
		  // float : 소숫점 7자리까지 정밀도가 유지됨.
		  // double : 소숫점 15자리까지 정밀도가 유지됨.
		float f1 = 1.0000001F;	//float 변수에 값을 저장할 경우 casting 필요
								//(float) f1 or f1F
		//리터럴 : 변수에 저장되는 값을 호칭할 때
		System.out.println(f1);
		
		float f2 = 1.00000001F;
		System.out.println(f2);
		
		System.out.println("========");
		
		double d1 = 1.000000000000001;
		System.out.println(d1);
		double d2 = 1.0000000000000001;
		System.out.println(d2);
		
	}

}
