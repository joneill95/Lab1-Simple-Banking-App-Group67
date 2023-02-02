package tests;

import java.util.Date;

import model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Automated testing
				//1-Setup the object and test data, initialize
				//See the four steps in: 
				String test_accountNumber = "1234";
				String test_userNameOfAccountHolder = "my_password";
				String test_accountType = "Mike";
				Date test_accountOpeningDate = new Date(2022,10,20);
				
				//2- Exercise,  run the object under test
				Account testAccount = new Account (test_accountNumber, test_userNameOfAccountHolder,test_accountType,test_accountOpeningDate);
				
				
				//3- Verify (Assert)
			    Boolean passed = true;
				
				if(testAccount.getAccountNumber() != test_accountNumber) {
					System.out.println("TC1 failed: Account Number did not match");
					passed = false;
				}
				
				if(testAccount.getUserNameOfAccountHolder() != test_userNameOfAccountHolder) {
					System.out.println("TC2 failed: Username did not match");
					passed = false;
				}
				
				if (testAccount.getAccountType() != test_accountType) {
					System.out.println("TC3 failed: Account Type does not match");
					passed = false;
				}
				
				if (testAccount.getAccountOpeningDate() != test_accountOpeningDate) {
					System.out.println("TC3 failed: Account Opening Date does not match");
					passed = false;
				}
				
				
				if(passed) {
					System.out.println("All TC's passed");
				}
	}

}
