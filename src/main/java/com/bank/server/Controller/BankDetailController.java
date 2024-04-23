package com.bank.server.Controller;

import com.bank.server.Entities.BankDetails;
import com.bank.server.Servcies.Impl.BankDetailImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankDetailController extends BankDetailImpl {
    @Autowired
    BankDetailImpl bdimpl;
    @PostMapping("/bankdetail")
    public BankDetails bankDetails(@RequestBody BankDetails bd){
        return bdimpl.bankDetails(bd);
    }
}
