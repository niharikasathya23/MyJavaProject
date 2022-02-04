
// concept of inheritance

class cycle {

	public int gear;
	public int speed;

	// constructor
	public cycle(int gear, int speed)
	{
		this.gear = gear;
		this.speed = speed;
	}

	
	public void applyBrake(int decrement)
	{
		speed -= decrement;
	}

	public void speedUp(int increment)
	{
		speed += increment;
	}

	
	public String toString()
	{
		return ("No of gears are " + gear + "\n"
				+ "speed of cycle is " + speed);
	}
}


class NewBike extends cycle {

	
	public int seatHeight;

	
	public NewBike(int gear, int speed,
						int seatHeight)
	{
		
		super(gear, speed);
		this.seatHeight = seatHeight;
	}

	
	public void setHeight(int newValue)
	{
		seatHeight = newValue;
	}

	
	@Override public String toString()
	{
		return (super.toString() + "\nseat height is "
				+ seatHeight);
	}
}


public class Bicycle {
	public static void main(String args[])
	{

		NewBike nb = new NewBike(4, 120, 30);
		System.out.println(nb.toString());
	}
}
