package learnJava;

public class accountholderObjects {

	public static void main(String[] args) {
		
//Account holder is class and object for tom. so tom is entered.	We need to create another class where we will create objects fpr account holder class	
// create objects for account holder class
		
		accountHolder tom = new accountHolder();
		accountHolder henry = new accountHolder();
		accountHolder sarah = new accountHolder();
	
// Create object for tom, henry and sarah
		tom.firstName = "Tom";
		tom.lastName = "Smith";
		tom.Age = 21;
		tom.accountBalance = 10000;
		tom.testcreditcardelibility();
		System.out.println("Is tom eligible for :" +tom.eligibleforcreditcard);
		
		henry.firstName = "Henry";
		henry.lastName = "Smith";
		henry.Age = 26;
		henry.accountBalance = 10000;
		henry.testcreditcardelibility();
		System.out.println("Is henry eligible for :" +henry.eligibleforcreditcard);
		
		sarah.firstName = "Sarah";
		sarah.lastName = "Smith";
		sarah.Age = 26;
		sarah.accountBalance = 40000;
		sarah.testcreditcardelibility();
		System.out.println("Is sarah eligible for :" +sarah.eligibleforcreditcard);
		
	}

}