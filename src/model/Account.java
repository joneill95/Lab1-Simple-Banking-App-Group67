package model;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Account {
	public Account(String accountNumber, String userNameOfAccountHolder, String accountType, Date accountOpeningDate) {
		super();
		this.accountNumber = accountNumber;
		this.userNameOfAccountHolder = userNameOfAccountHolder;
		this.accountType = accountType;
		this.accountOpeningDate = accountOpeningDate;
	}
	String accountNumber;
	String userNameOfAccountHolder;
	String accountType;
	Date accountOpeningDate;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getUserNameOfAccountHolder() {
		return userNameOfAccountHolder;
	}
	public void setUserNameOfAccountHolder(String userNameOfAccountHolder) {
		this.userNameOfAccountHolder = userNameOfAccountHolder;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Date getAccountOpeningDate() {
		return accountOpeningDate;
	}
	public void setAccountOpeningDate(Date accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}
	
}
