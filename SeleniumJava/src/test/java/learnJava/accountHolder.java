package learnJava;

public class accountHolder {
	
	String firstName;
	String lastName;
	int Age;
	float accountBalance;
	boolean eligibleforcreditcard;
	
	public void testcreditcardelibility() {
		
		if (Age>25 && accountBalance>=20000) {
		eligibleforcreditcard=true;
	
	}
	}

}
