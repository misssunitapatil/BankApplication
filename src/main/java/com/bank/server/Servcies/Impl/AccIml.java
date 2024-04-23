package com.bank.server.Servcies.Impl;

import com.bank.server.Entities.Account;
import com.bank.server.Entities.BankLocation;
import com.bank.server.Repository.AccRepository;
import com.bank.server.Servcies.AccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccIml implements AccService {
    @Autowired
    AccRepository accr;
    @Override
    public Account addaccount(Account account) {
        return accr.save(account);
    }


}
