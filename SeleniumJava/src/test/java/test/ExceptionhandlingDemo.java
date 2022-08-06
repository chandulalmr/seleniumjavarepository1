package test;

public class ExceptionhandlingDemo {

	public static void main(String[] args) {	
		try {
			firsttest();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	public static void firsttest()throws Exception {
		System.out.println("Test 1");
			int i = 1/0;
			System.out.println("Test 2");
	}

}