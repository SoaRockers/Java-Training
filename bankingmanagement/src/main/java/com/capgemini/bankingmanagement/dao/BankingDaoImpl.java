package com.capgemini.bankingmanagement.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.bankingmanagement.model.Account;
public class BankingDaoImpl implements IBankingDao{

	private List<Account> accountList = new ArrayList<Account>();
	
	public BankingDaoImpl(){
		Account a1= new Account(11, 4000);
		Account a2= new Account(12, 8500);
		Account a3= new Account(13, 9500);
		accountList.add(a1);
		accountList.add(a2);
		accountList.add(a3);
	}
	
	@Override
	public void addAccountDetails(Account account) {
		accountList.add(account);
	}

	@Override
	public Account getAccountByAccountNumber(Integer accountnumber) {
		Account account1= null;
		for(Account account: accountList)
		{
			if(account.getAccountNumber() == accountnumber)
			{
				account1 = account;
			}
		}
		return account1;
	}

}
