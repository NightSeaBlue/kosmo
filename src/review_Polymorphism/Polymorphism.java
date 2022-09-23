package review_Polymorphism;

import java.util.Scanner;

public class Polymorphism {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Item i = null;
		System.out.println("알고싶은 종류를 입력해 주세요 (1. 책 , 2. Dvd , 3. Cd)");
		int n = input.nextInt();
		
		switch(n) {
		case 1 : i = new Book (); break;
		case 2 : i = new Dvd (); break;
		case 3 : i = new Cd (); break;
		}
		i.output();
		input.close();
		

	}

}
