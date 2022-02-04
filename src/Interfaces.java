
// Interface Class

interface Shapes {
	
	 public double areas();
	abstract public void draws();
}

class Tri implements Shapes {

	int length, width;

	// Constructor
	Tri(int length, int width, String name)
	{

		
		this.length = length;
		this.width = width;
	}


	@Override 
	public void draws()
	{
		System.out.println("Rectangle has been drawn ");
	}

	@Override 
	public double areas()
	{
		// Length * Breadth
		return (double)(length * width)/2;
	}
}


class Circ implements Shapes {

	
	double pi = 3.14;
	int radius;

	// Constructor
	Circ(int radius, String name)
	{
		
		this.radius = radius;
	}

	
	@Override 
	public void draws()
	{

		System.out.println("Circle has been drawn ");
	}


	@Override
	public double areas()
	{
		return (double)((pi * radius * radius));
	}
}


public class Interfaces {

	
	public static void main(String[] args)
	{
		
		Shapes tri = new Tri(2, 3, "Triangle");

		System.out.println("Area of Triangle: "
						+ tri.areas());

	
		Shapes circle = new Circ(2, "Circle");

		System.out.println("Area of circle: "
						+ circle.areas());

	
	}
}
