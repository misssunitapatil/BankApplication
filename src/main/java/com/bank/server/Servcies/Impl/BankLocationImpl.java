package com.bank.server.Servcies.Impl;

import com.bank.server.Repository.BankLocationRepository;
import com.bank.server.Servcies.BankLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankLocationImpl implements BankLocation {
    @Autowired
    BankLocationRepository blr;
    @Override
    public com.bank.server.Entities.BankLocation bankLocation(com.bank.server.Entities.BankLocation bl) {
        return blr.save(bl);
    }
}
