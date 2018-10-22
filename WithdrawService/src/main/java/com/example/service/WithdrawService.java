package com.example.service;

public class WithdrawService {

	public void withdraw(double amount, double accountBalance) {
		accountBalance-=amount;
	}
}
