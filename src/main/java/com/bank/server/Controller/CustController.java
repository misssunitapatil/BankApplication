package com.bank.server.Controller;

import com.bank.server.Entities.Customer;
import com.bank.server.Repository.CustRepository;
import com.bank.server.Servcies.Impl.CustImpl;
import com.bank.server.Servcies.Impl.TranscationImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustController extends CustImpl {
    @Autowired
    CustImpl custimpl;

    @PostMapping("/insert")
    public Customer insertcust(@RequestBody Customer customer){
        return custimpl.insertcust(customer);
    }
}
