package com.bank.server.Controller;

import com.bank.server.Entities.Account;
import com.bank.server.Servcies.Impl.AccIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccController extends AccIml {
    @Autowired
    AccIml acciml;
    @PostMapping("/addaccount")
    public Account addaccount(@RequestBody Account a){

        return acciml.addaccount(a);
    }

}
