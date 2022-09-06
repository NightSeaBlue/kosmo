package chapter02;

public class ConsoleOutput03 {
	public static void main(String[] args) {
		//#System.out.println();
		System.out.println("안녕 하세요");
		System.out.println("안녕"+" 하세요");	//+ : 문자열 <연결 연산자>
		System.out.println(2+4); 			//+ : 정수일 때는 <덧셈>
		System.out.println(2+"4");	 		//정수 + 문자열 : 연결 연산자로 적용
		System.out.println("문자"+ 1);		//<연결>
		System.out.println("문자"+1+3); 		//<연결>
		System.out.println(1+3+"문자");	 	//<덧셈> 이후 <연결>
		System.out.println();
				
		int a = 5 ;		// int : 정수 할당
		String b = "하세요" ;		// String : 문자열 할당
		int c = 7 ;
		System.out.println(a);
		System.out.println(b);
		System.out.println("안녕"+b);
		System.out.println(a+b); 		 //+ : 연결
		System.out.println(a+c); 		//+ : sum
		System.out.println(a+"안녕"+b); 	//정의한 변수에는 ""표기하지 않음
		
		
		//#System.out.print();
		System.out.print("반갑");
		System.out.print("습니다");
		System.out.print(7);
		
		System.out.print("\n");
		System.out.print("\n");
		
		
		
		//#System.out.printf(); 		//할당한 변수 출력
		
		int d = 45 ;
		String e = "화요일" ;
		String f = "남자" ;
		
		System.out.printf("당신의 나이는"+d+"세이고, 오늘은 "+e+
				"이고, 당신은 "+f+"입니다."
				);
		System.out.printf("당신의 나이는 %d 이고, 오늘은 %s 이고, 당신은 %s입니다.", 
				d,e,f);
		System.out.println();
		
		int g = 100;
		String h = "일요일";
		String i = "여자";
		
		//여자는 평균 나이가 100살이 될 것입니다. 평균적으로 일요일에 많이 태어 났습니다.
		
		System.out.println(i+"는 평균 나이가 "+g+"살이 될 것입니다. 평균적으로 "+h+"에 많이 태어났습니다.");
		System.out.printf("%s는 평균 나이가 %d살이 될 것입니다. 평균적으로 %s에 많이 태어났습니다.",i,g,h);
		
			
		
		
		
		
	}

}
