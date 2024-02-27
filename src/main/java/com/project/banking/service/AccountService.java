package com.project.banking.service;


import com.project.banking.dto.AccountDto;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long id);
    AccountDto deposit(Long id, double amount);
    AccountDto withdrawal(Long id, double amount);
    List<AccountDto> getAllAccounts();
    void deleteAccount(Long id);
}
