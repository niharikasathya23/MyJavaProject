package com.rakuten.trainings.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericStackApp {
	
	public static <T> T selectOneOfTheseTwo(T first,T second) {
		return null;
	}
	
	
	
	public static double sumOf(Stack<? extends Number> s)
	//? extends is a wildcard
	{
		double sum=0;
		sum+=s.pop().doubleValue();
		sum+=s.pop().doubleValue();
		return sum;
		
	}
	public static void main(String[] args) {
		//String selected=(String)  selectOneOfTheseTwo("hi","hello");
		//Integer islecetd=(Integer) selectOneOfTheseTwo(23, 32);--->when just object was return type then type conversion was required
		String selected= selectOneOfTheseTwo("hi","hello");
		Integer iselected= selectOneOfTheseTwo(23, 32);
		
		
		Stack<String>s = new FixedArrayStack<>(10);
		//s.push(10);
		s.push("abc");
		String s1=s.pop();
		
		Stack<Integer> iStack=new FixedArrayStack<>(2);
		iStack.push(34);
		iStack.push(23);
		
		Number n =new Double(10);
		List l=new ArrayList();
		Stack st=new FixedArrayStack(10);
		
		ArrayList<Double> dList=new ArrayList<Double>();
		
	//	double sum=sumOf(iStack);
		//System.out.println(sum);
		
		
	} 

}
