package com.bank.server.Servcies.Impl;

import com.bank.server.Entities.Transcation;
import com.bank.server.Repository.TransactionRepository;
import com.bank.server.Servcies.TranscationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranscationImpl implements TranscationService {
    @Autowired
    TransactionRepository tr;
    @Override
    public Transcation transcation(Transcation t) {
        return tr.save(t);
    }
}
