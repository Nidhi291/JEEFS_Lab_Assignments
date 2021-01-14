package com.cg.accmgmt.domain;
/**
 * This account domain is used for data transfer between layers. 
 * @author NIDHI
 *
 */
public abstract class Account {
	/**
	 * account number of user
	 */
	private Long accNo;
	/**
	 * Name of the account holder
	 */
	private String accountHolder;
	
	public Account(final Long accNo, final String accountHolder) {
		super();
		this.accNo = accNo;
		this.accountHolder = accountHolder;
	}
	public Long getAccNo() {
		return accNo;
	}
	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	

}
