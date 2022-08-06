package test;

public class Exceptionhandling {

	public static void main(String[] args) {	
		
		System.out.println("Test 1");

		try {
			int i = 1/0;
			System.out.println("Test 2");

		} catch (Exception e) {
			System.out.println("I am inside catch block");
			System.out.println("Message is: " +e.getMessage());
			System.out.println("Cause is: " +e.getCause());
			e.printStackTrace();
		}

		//Finally block will work irrespective of exception

		finally {
			System.out.println("I am inside Finally Block");
		}
	}

}
