
package c_collection;
import java.util.ArrayList;

class aArrayListEx
{
	public static void main(String[] args) 
	{
		Object [] result = dataSet();		// 메서드를 입력받을 타입 지정

		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		for (int i = 0 ; i < result.length ; i++) {	
			System.out.println(result[i]);	// i의 길이가 배열 result의 길이보다 작다면 증가시키고 그 값을 출력
		}

	}

	static Object [] dataSet()
	{
		String	name = "김태희";
		int		age = 31;
		double	height = 162.3;
		
		Object [] obj = new Object [3];		// 모든 변수의 부모 클래스가 Object 이므로 Object 배열로 지정해 값을 저장
		obj[0] = name;
		obj[1] = age;
		obj[2] = height;


		return obj;		// obj 라는 새로운 배열을 생성했으므로, 리턴 타입 지정 및 메서드 형태 지정
	}
}
