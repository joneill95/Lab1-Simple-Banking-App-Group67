package tests;
import model.User;

public class UserTest {

	public static void main(String[] args) {
		/* OLD: manual tesing
		User testUser = new User("mike","my_password", "Mike", "Smith", "07771234567"); 
		System.out.println(testUser.toString());
		*/
		
		//Automated testing
		
		//1-Setup the object and test data, initialize
		//See the four steps in: 
		String test_username = "mike";
		String test_password = "my_password";
		String test_first_name = "Mike";
		String test_last_name = "Smith";
		String test_mobile_number = "07771234567";
		
		//2- Exercise,  run the object under test
		User testUser = new User (test_username, test_password, test_first_name, test_last_name, test_mobile_number);
		
		/*
		//3- Verify (Assert)
	    Boolean passed = true;
		
		if(testUser.getUsername() != test_username) {
			System.out.println("TC1 failed: username did not match");
			passed = false;
		}
		
		if(testUser.getPassword() != test_password) {
			System.out.println("TC2 failed: password did not match");
			passed = false;
		}
		
		if (testUser.getFirstName() != test_first_name) {
			System.out.println("TC3 failed: first name does not match");
			passed = false;
		}
		
		if (testUser.getLastName() != test_last_name) {
			System.out.println("TC3 failed: last name does not match");
			passed = false;
		}
		
		if (testUser.getMobileNumber() != test_mobile_number) {
			System.out.println("TC3 faailed: mobile number does not match");
			passed = false;
		}
		
		if(passed) {
			System.out.println("All TC's passed");
		}
		*/
		
		//Using asserts 
		assert testUser.getUsername() == test_username;
		assert testUser.getPassword() == test_password;
		assert testUser.getFirstName() == test_first_name;
		assert testUser.getLastName() == test_last_name;
		assert testUser.getMobileNumber() == test_mobile_number;
		
		System.out.println("All Java assertions in the test suite passed (none failed)");
		
		
	}
}
