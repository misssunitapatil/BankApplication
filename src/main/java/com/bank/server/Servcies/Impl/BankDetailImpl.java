package com.bank.server.Servcies.Impl;

import com.bank.server.Entities.BankDetails;
import com.bank.server.Repository.BankDetailRepository;
import com.bank.server.Servcies.BankDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankDetailImpl implements BankDetailService {
    @Autowired
    BankDetailRepository bdr;
    @Override
    public BankDetails bankDetails(BankDetails bd) {

        return bdr.save(bd);
    }
}
