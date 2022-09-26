package c_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {
	
	public static void main(String[] args) {
		
		// 1. 스택	// 인터넷 익스플로러 뒤로가기 등에 활용
		
		Stack <String> s = new Stack <> ();
		s.push("A");
		s.push("B");
		s.push("C");
		
		System.out.println(s.pop());	// C 가 맨 나중에 들어갔으므로 C가 출력
		
		// 2. Queue
		
		Queue <String> q = new LinkedList <> ();		//Queue 는 util 내 interface로 존재 따라서 상속가능한 클래스로 객체 생성
		q.offer("A");
		q.offer("B");
		q.offer("C");
		
		System.out.println(q.poll());	// Queue 는 선입 선출
		
		
		
		
		
	}

}
