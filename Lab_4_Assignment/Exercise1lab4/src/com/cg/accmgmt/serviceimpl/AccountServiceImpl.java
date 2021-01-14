package com.cg.accmgmt.serviceimpl;

import java.util.List;

import com.cg.accmgmt.domain.Account;
import com.cg.accmgmt.exception.InsufficientBalanceException;
import com.cg.accmgmt.exception.InvalidAccountNumberException;
import com.cg.accmgmt.service.AccountService;

public class AccountServiceImpl implements AccountService
{
	private List<Account> accountRepository;
	public AccountServiceImpl()
	{
		accountRepository = new ArrayList<>();
	}
	@override
	public void createAccount(int accType, String accountHolder)
	{
		Account newAccount = null;
		Long newAccountNumber = System.currentTimeMillis();
		double openingBalance;
		if(accType==AccountService.ACCOUNT_TYPE_SAVING_ACCOUNT)
		{
			//object of saving account
			openingBalance = 500;
			newAccount = new SavingAccount(newAccountNumber, accountHolder, openingBalance)
		}
		else if(accType==AccountService.ACCOUNT_TYPE_CURRENT_ACCOUNT)
		{
			//object of current account
			openingBalance = 5000;
			newAccount = new CurrentAccount(newAccountNumber, accountHolder, openingBalance)
		}
		//save object in repository
		accountRepository.add(newAccount);
	}
	@override
	public void depositMoney(Long accNo, int accType, double amount) throws InvalidAccountNumberException
	{
	}
	@override
	public void withdrawMoney(Long accNo, int accType, double amount) throws InvalidAccountNumberException, InsufficientBalanceException
	{
	}
	@override
	public Account displayAccountStatus(Long accNo, int accType) throws InvalidAccountNumberException
	{
		return null;
	}
	
	@override
	List<Account> showAllAccounts()
	{
		return accountRepository;
	}
	
}
