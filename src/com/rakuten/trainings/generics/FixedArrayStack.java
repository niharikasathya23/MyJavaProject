package com.rakuten.trainings.generics;

public class FixedArrayStack<E> implements Stack<E>{
	Object[] contents;
	int top=-1;
	public FixedArrayStack(int capacity) {
		contents=new Object[capacity];
		
	}
	public void push(E element) {
		// TODO Auto-generated method stub
		contents[++top]=element;
	}
	public E pop() {
		// TODO Auto-generated method stub
		return (E) contents[top--];
	}

}
