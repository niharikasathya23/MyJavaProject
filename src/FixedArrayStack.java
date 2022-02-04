
public class FixedArrayStack implements Stack{
	Object[] contents;
	int top=-1;
	public FixedArrayStack(int capacity) {
		contents=new Object[capacity];
		
	}
	public void push(Object element) {
		// TODO Auto-generated method stub
		contents[++top]=element;
	}
	public Object pop() {
		// TODO Auto-generated method stub
		return contents[top--];
	}

}
