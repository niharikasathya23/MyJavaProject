
public class OverloadingMultiply {
	
		public int mul(int x, int y)
		{
			return (x * y);
		}

		
		public int mul(int x, int y, int z)
		{
			return (x * y * z);
		}

		
		public double mul(double x, double y)
		{
			return (x + y);
		}

		
		public static void main(String args[])
		{
			OverloadingMultiply m = new OverloadingMultiply();
			System.out.println(m.mul(10, 20));
			System.out.println(m.mul(10, 20, 30));
			System.out.println(m.mul(10.5, 50.5));
		}
	

}
