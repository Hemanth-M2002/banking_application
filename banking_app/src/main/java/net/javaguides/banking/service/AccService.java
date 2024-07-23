package net.javaguides.banking.service;

import org.springframework.stereotype.Service;

@Service
public class AccService {

    public Account getAccountDetails() {
        // Simulating account details fetching
        Account account = new Account();
        account.setName("John Doe");
        account.setBalance(2500.75);
        return account;
    }
}
