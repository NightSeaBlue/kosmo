package Review04;

import java.util.Scanner;

public class CalculatorTest_Ver2 {

	public static void main(String[] args) {
		CalculatorExpr_Ver2 cal = new CalculatorExpr_Ver2 ();
		Scanner sc = new Scanner (System.in);
		int count = 0;
		while (true) {
			System.out.println("숫자 2개를 입력하세요 ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			sc.nextLine();

			cal.setNum1(num1); cal.setNum2(num2);
			int add = cal.getAddition();
			int sub = cal.getSubtraction();
			int mul = cal.getMultiplication();
			double div = cal.getDivision();
			if (count > 0 ) {
				System.out.println("추출된 숫자 : "+cal.getNum1() + " "+ cal.getNum2());
			}
			cal.output();
			System.out.println("계속 진행 하시겠습니까? (Y/N) ");
			String re = sc.nextLine();
			if (re.equalsIgnoreCase("N")) {
				break;
			}
			count++;
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}

