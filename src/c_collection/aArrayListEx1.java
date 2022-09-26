package c_collection;

import java.util.ArrayList;

public class aArrayListEx1 {

	public static void main(String[] args) {
		
			ArrayList result = dataSet();		// 메서드를 입력받을 타입 지정 , 동적인 배열인 ArrayList로 받음

			// dataSet() 안의 변수 값들을 여기서 출력한다면??
			for (int i = 0 ; i < result.size() ; i++) {	// ArrayList의 경우 동적 배열임으로 size를 활용해 크기 비교
				System.out.println(result.get(i));	// i의 길이가 배열 result의 길이보다 작다면 증가시키고 그 값을 출력
			}

		}

		static ArrayList dataSet()
		{
			String	name = "김태희";
			Integer	age = 31;		//int age = 31;
			double	height = 162.3;
			
			ArrayList list = new ArrayList ();		// 변수의 갯수에 상관없이 값을 받을 수 있는 배열 생성
			
			list.add(name);
			list.add(age);
			list.add(height);

			return list;		// obj 라는 새로운 배열을 생성했으므로, 리턴 타입 지정 및 메서드 형태 지정
		}

	}


