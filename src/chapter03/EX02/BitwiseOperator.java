package chapter03.EX02;

public class BitwiseOperator {

	public static void main(String[] args) {
		// Bit 연산
		// JAVA Method를 사용해 진법변환 (2진수, 8진수, 16진수)
		int data =13;
		
		//Integer 객체의 함수를 사용(Int+ctrl+space)	 (총 32bit, 4byte, int)
		//Integer.toXXXString : 입력값을 특정 XXX진수로 변환
		// -- toBinaryString(입력값) : 입력값을 2진수로 변환
		// -- toOctalString(입력값) : 입력값을 8진수로 변환
		// -- toHexString(입력값) : 입력값을 16진수로 변환
		
		System.out.println(Integer.toBinaryString(data));	//정수 to 2진수
		System.out.println(Integer.toOctalString(data));	//정수 to 8진수
		System.out.println(Integer.toHexString(data));		//정수 to 16진수
		System.out.println("=======================");
		
		//2진수, 8진수, 16진수의 값을 10진수로 변환
		//Integer.parseInt("입력값",X) : 특정 X진수의 값을 10진수로 변환
		//Integer.parseInt("입력값",2)
		//Integer.parseInt("입력값",8)
		//Integer.parseInt("입력값",16)
		
		System.out.println(Integer.parseInt("1101",2));		//2진수 to 10진수
		System.out.println(Integer.parseInt("15",8));		//8진수 to 10진수
		System.out.println(Integer.parseInt("D",16));		//16진수 to 10진수
		System.out.println("=================");
		
		//다양한 진법 표현
		System.out.println(13);
		System.out.println(0b1101);		//2진수
		System.out.println(015);		//8진수
		System.out.println(0xd);		//16진수
		System.out.println("=================");
		
		//비트 연산자 And : &		<= 두 비트 모두 1일 때 1
		System.out.println(3&10);		//2
		System.out.println(0b0011&0b1010);	//2
		System.out.println(0x03&0x0A);		//2
		System.out.println("====================");
		
		//비트 연산자 OR : |		<= 두 비트 중 하나라도 1이 존재할 경우 1
		System.out.println(3|10);
		System.out.println(0b0011|0b1010);
		System.out.println(0x03|0x0A);
		System.out.println("=====================");
		
		//비트 연산자 XOR : ^ < = 두 비트가 동일한 경우 0, 다를 경우 1
		System.out.println(3^10);
		System.out.println(0b0011^0b1010);
		System.out.println(0x03^0x0A);
		System.out.println("=======================");
		
		
		//비트 연산자 NOT : ~ < = 0일 때 1, 1 일 때 0
		System.out.println(~3);
		System.out.println(~0b0011);
		System.out.println(~0x03);
		System.out.println("=======================");
		
		
		int abc=123;		//10진수
		int bcd=0123;		//8진수
		int efg=0x123;		//16진수
		
		System.out.println(abc);
		System.out.println(bcd);
		System.out.println(efg);
		System.out.println("===========================");
		
		
		
		
		// IP Address Subnet MASK AND 연산
		// IP Address : 192. 168. 100. 100
		// Subnet Mask : 255. 255. 255. 0
		
		//2진수 변환
		System.out.println(Integer.toBinaryString(192));
		System.out.println(Integer.toBinaryString(168));
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toBinaryString(255));
		System.out.println("=========================");
		
		//10진수 기준 연산
		System.out.printf("%d.%d.%d.%d\n", 192&255,168&255,100&255,100&0);
		System.out.printf("%d.%d.%d.%d\n",192|255,168|255,100|255,100|0);
		System.out.printf("%d.%d.%d.%d\n",192^255,168^255,100^255,100^0);
		System.out.println("===================");

		//2진수 기준 연산
		System.out.printf("%d.%d.%d.%d\n", 0b11000000&0b11111111,0b10101000&0b11111111,0b01100100&0b11111111,0b01100100&0b00000000);
		System.out.printf("%d.%d.%d.%d\n",0b11000000|0b11111111,0b10101000|0b11111111,0b01100100|0b11111111,0b01100100|0b00000000);
		System.out.printf("%d.%d.%d.%d\n",0b11000000^0b11111111,0b10101000^0b11111111,0b01100100^0b11111111,0b01100100^0b00000000);
		System.out.println("========================");
		
		
	}

}
