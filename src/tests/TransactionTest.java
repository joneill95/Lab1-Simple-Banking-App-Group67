package tests;

import java.util.Date;

import model.Transaction;

public class TransactionTest {

	public static void main(String[] args) {
		// OLD: manual testing
		/*
		 * Date testDate = new Date(02-02-2023); Transaction testTransaction = new
		 * Transaction("1", 10.00, testDate);
		 * System.out.println(testTransaction.toString());
		 */

		// Automated testing

		// 1-Setup the object and test data, initialize
		// See the four steps in:
		String test_account_number = "1";
		double test_transaction_amount = 10.00;
		Date test_date = new Date(02 - 02 - 2023);

		// 2- Exercise, run the object under test
		Transaction testTransaction = new Transaction(test_account_number, test_transaction_amount, test_date);
/*
		// 3- Verify (Assert)
		Boolean passed = true;

		if (testTransaction.getAccount_number() != test_account_number) {
			System.out.println("TC1 failed: account number did not match");
			passed = false;
		}

		if (testTransaction.getTransaction_amount() != test_transaction_amount) {
			System.out.println("TC2 failed: transaction amount did not match");
			passed = false;
		}

		if (testTransaction.getTransaction_date() != test_date) {
			System.out.println("TC3 failed: date does not match");
			passed = false;
		}

		if (passed) {
			System.out.println("All TC's passed");
		}
*/
		// Using asserts
		assert testTransaction.getAccount_number() == test_account_number;
		assert testTransaction.getTransaction_amount() == test_transaction_amount;
		assert testTransaction.getTransaction_date() == test_date;
		
		System.out.println("All Java assertions in the test suite passed (none failed)");

	}

}
