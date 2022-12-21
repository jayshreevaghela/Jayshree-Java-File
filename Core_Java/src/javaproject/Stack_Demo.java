package javaproject;

import java.util.Stack;

public class Stack_Demo {
	
	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
	}

}
