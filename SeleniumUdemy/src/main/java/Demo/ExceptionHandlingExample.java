package Demo;

public class ExceptionHandlingExample {
	public static void main(String[] args) throws Exception {
		demo();

	}
	
	public static void demo() throws Exception
	{

		System.out.println("hi");
		throw new ArithmeticException("not valid operation");
//		int i = 1/0;
//		System.out.println("completed");
		
	}

}
//try
//{
//	System.out.println("hi");
//	
//	int i = 1/0;
//	System.out.println("completed");
//}
//catch(Exception exp)
//{
//	System.out.println("inside catch block");
//	System.out.println("Message is: " + exp.getMessage());
//	System.out.println("cause is: " + exp.getCause());
//	exp.printStackTrace();
//}