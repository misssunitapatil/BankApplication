package com.bank.server.Servcies.Impl;

import com.bank.server.Entities.Customer;
import com.bank.server.Repository.CustRepository;
import com.bank.server.Servcies.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class CustImpl implements CustService {
    @Autowired
    CustRepository custr;
    @Override
    public Customer insertcust(Customer customer) {
        customer.setLoginDate(LocalDate.now().toString());
        customer.setLogoutTime(LocalTime.now().toString());
        return custr.save(customer);
    }
}
