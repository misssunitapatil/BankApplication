package com.bank.server.Controller;

import com.bank.server.Entities.BankLocation;
import com.bank.server.Servcies.Impl.BankDetailImpl;
import com.bank.server.Servcies.Impl.BankLocationImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankLocationController extends BankLocationImpl {
    @Autowired
    BankLocationImpl blimpl;
    @PostMapping("/banklocation")
    public BankLocation bankLocation(@RequestBody BankLocation bl){
        return blimpl.bankLocation(bl);
    }

}
