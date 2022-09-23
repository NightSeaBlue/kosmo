package Review_Inherit;

public class Daughter extends Mother {
	
	public Daughter () {
		System.out.println("딸 생성");
	}
	
	public void study () {
		System.out.println("딸은 공부를 합니다.");
	}
	
	@Override
	public void job () {
		System.out.println("무직");
	}
	
	@Override
	public void gene () {
		System.out.println("딸은 자녀");
	}

}
