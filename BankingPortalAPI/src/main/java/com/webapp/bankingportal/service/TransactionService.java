package com.webapp.bankingportal.service;

import java.util.List;

public interface TransactionService {
	
	List<TransactionDTO> getAllTransactionByAccountNumber(String accountNumber);

}
