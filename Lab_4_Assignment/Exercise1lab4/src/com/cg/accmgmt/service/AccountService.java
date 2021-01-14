package com.cg.accmgmt.service;
import com.cg.accmgmt.exception.InvalidAccountNumberException;
/**
 * This AccountService interface will perform all the account related operations
 * @author NIDHI
 *
 */
public interface AccountService {
	int ACCOUNT_TYPE_SAVING_ACCOUNT=1;
	int ACCOUNT_TYPE_CURRENT_ACCOUNT=2;
	/**
	 * This createAccount method will create the Account based on below information
	 
	 * @param accType the type of account user would like to open
	 * @param accountHolder name of the user holding specific account
	 * @param openingBalance is the starting balance account as per account type
	 */
	void createAccount(int accType, String accountHolder);
	/**
	 * This depositMoney method will deposit the specified amount in the specified account type and accountNumber
	 * @param accNo of the user, where amount will be added, and balance will be updated
	 * @param accType type of the account user is holding 
	 * @param amount that user is depositing in the account
	 * @throws InvalidAccountNumberException will be thrown in case amount is supposed to be added in wrong account no.
	 */
	void depositMoney(Long accNo, int accType, double amount) throws InvalidAccountNumberException;
	/**
	 * 
	 * @param accNo
	 * @param accType
	 * @param account
	 * @throws InvalidAccountNumberException
	 * @throws InsufficientBalanceException
	 */
	void withdrawMoney(Long accNo, int accType, double account) throws InvalidAccountNumberException, InsufficientBalanceException;
	/**
	 * 
	 * @param accNo
	 * @param accType
	 * @return
	 * @throws InvalidAccountNumberException
	 */
	Account displayAccountStatus(Long accNo, int accType)throws InvalidAccountNumberException;

}
