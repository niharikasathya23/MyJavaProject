
// Abstract Class

abstract class Shape {


	String objectName = " ";

	// Constructor of this class
	Shape(String name) {
		this.objectName = name; 
		}


	// Non-abstract methods
	
	public void moveTo(int x, int y)
	{
		System.out.println(this.objectName + " "
						+ "has been moved to"
						+ " x = " + x + " and y = " + y);
	}

	// Abstract methods 
	abstract public double area();
	abstract public void draw();
}

class Triangle extends Shape {

	int length, width;

	// Constructor
	Triangle(int length, int width, String name)
	{

		
		super(name);

		
		this.length = length;
		this.width = width;
	}


	@Override 
	public void draw()
	{
		System.out.println("Rectangle has been drawn ");
	}

	@Override 
	public double area()
	{
		// Length * Breadth
		return (double)(length * width)/2;
	}
}


class Circle extends Shape {

	
	double pi = 3.14;
	int radius;

	// Constructor
	Circle(int radius, String name)
	{
		
		super(name);
		
		this.radius = radius;
	}

	
	@Override 
	public void draw()
	{

		System.out.println("Circle has been drawn ");
	}


	@Override
	public double area()
	{
		return (double)((pi * radius * radius));
	}
}


class Abstraction {

	
	public static void main(String[] args)
	{
		
		Shape tri = new Triangle(2, 3, "Triangle");

		System.out.println("Area of Triangle: "
						+ tri.area());

		tri.moveTo(3, 4);

	
		Shape circle = new Circle(2, "Circle");

		System.out.println("Area of circle: "
						+ circle.area());

		circle.moveTo(2, 4);
	}
}
