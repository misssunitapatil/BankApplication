package com.bank.server.Controller;

import com.bank.server.Entities.Transcation;
import com.bank.server.Servcies.Impl.TranscationImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranscationController extends TranscationImpl {
    @Autowired
    TranscationImpl timpl;
    @PostMapping("/transcation")
    public Transcation transcation(@RequestBody Transcation t){
        return timpl.transcation(t);
    }
}
