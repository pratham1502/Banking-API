package com.webapp.bankingportal.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.bankingportal.service.AccountService;
import com.webapp.bankingportal.service.TransactionService;

import lombok.val;

@RestController
@RequestMapping("/api/account")

public class AccountController {
	private final AccountService accountservice;
	private final TransactionService transactionService;
	
	@GetMapping("/pin/check")
	public ResponseEntity<String> checkAccountPIN(){
		val isPINValid=accountservice.isPinCreated(LoggedinUser.getAccountNumber);
		val response =isPINValid ? ApiMessages.PIN_Created.getMessages();
			:ApiMessage.PIN_NOT_CREATED.getMessage();
		
		return ResponseEntity.ok(response);
	}
	
	@PostMapping("/pin/create")
	public ResponseEntity<String> createPIN(@RequestBody PinRequest pinRequest){
		accountservice.createPin(LoggedinUser.getAccountNumber(),
				pinRequest.password(),
				pinRequest.pin());
		
		return ResponseEntity.ok();
	}
	
	@PostMapping("/pin/update")
	public ResponseEntity<String> updatePIN(){
		
		return ResponseEntity.ok();
	}
	
	@PostMapping("/deposit")
	public ResponseEntity<String> updatePIN(){
		
		return ResponseEntity.ok();
	}
	
	@PostMapping("/withdraw")
	public ResponseEntity<String> cashWithdrawl(){
		
		return ResponseEntity.ok();
	}
	@PostMapping("/fund-transfer")
	public ResponseEntity<String> fundTransfer(){
		
		return ResponseEntity.ok();
	}

	@GetMapping("/transaction")
	public ResponseEntity<String> getAllTransactionsByAccountNumber(){
		
		return ResponseEntity.ok();
	}
	
	
	
	
	
	

}
