
public class ThrowAndThrows  
{  
    // defining a user-defined method which throws ArithmeticException  
    static void validate(int age) throws ArithmeticException  
    {  
        if(age<18) {
        throw new ArithmeticException("not eligible to vote");
        }
        else {
        	System.out.println("eligible to vote");
        }
    }  
      
    public static void main(String args[])  
    {  
        validate(14);
    }  
}  