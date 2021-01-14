package com.cg.accmgmt.util;
import java.util.Scanner;

import com.cg.accmgmt.service.AccountService;
import com.cg.accmgmt.serviceimpl.AccountServiceImpl;

public class MenuUtil 
{
	private AccountService accountService;
	
	public MenuUtil()
	{
		accountService = new AccountServiceImpl();
	}
	public void start()
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		String continueChoice;
		do
		{
			showMenu();
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("---Create account---");
				System.out.println("Which type of account you want to open 1. Saving, 2. Current");
				int accountType = sc.nextInt();
				System.out.println("What is your name");
				String accountHolder = sc.next();
				accountService.createAccount(accountType, accountHolder);
				System.out.println("Success! Your account is opened with NBI");
				break;
			case 2:
				System.out.println("---List all account---");
				List<Account> accounts = accountService.showAllAccounts();
				for(Account account : account)
				{
					System.out.println("Account No : " +account.getAccNo());
					System.out.println("Account Holder : " +account.getAccountHolder());
					if(account instanceof SavingAccount)
					{
						System.out.println("Account Type : Saving Account");
						SavingAccount sa = (SavingAccount) account;
						System.out.println("Balance:"+ ((SavingAccount) account).getBalance());
					}
					if(account instanceof CurrentAccount)
					{
						System.out.println("Account Type : Current Account");
						System.out.println("Balance:"+ ((CurrentAccount) account).getOverDrawLimit());
					}
					
				}
				break;
			case 3:
				System.exit(0);
				break;
			default:
				break;
			}
			System.out.println("Do you want to continue(yes/no):");
			continueChoice = sc.next();
		}while(continueChoice.equalsIgnoreCase("yes"));
	}
	
	private void showMenu()
	{
		System.out.println("---NBI Bank---");
		System.out.println("1. Create Account");
		System.out.println("2. Show all Accounts");
		System.out.println("0. Exit");
	}

}
