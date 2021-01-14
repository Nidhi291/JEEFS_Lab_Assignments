package com.cg.accmgmt.exception;

public class InsufficientBalanceException {

	private static final long serialVersionUID = 1L;
	/**
	 * This will create InsufficientException class without error message
	 */
	public InsufficientBalanceException()
	{
		super();
	}
	/**
	 * This will create InsufficientBalanceException class with error message
	 */
	public InsufficientBalanceException(String errMsg)
	{
		super(errMsg);
	}
}
