package com.avinash.as3;

public interface BankAccountRepository {
	public double getBalance(long accountId);
	public double updatedBalance(long accountId, double newBalance );

}
