package com.bank.server.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountId;
    private String accountNo;
    private long accountBalance;
    @OneToOne
    Customer cust;
    @OneToOne
    BankDetails bankdetails;
    @OneToMany
    List<Transcation> transcation;
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public BankDetails getBankdetails() {
        return bankdetails;
    }

    public void setBankdetails(BankDetails bankdetails) {
        this.bankdetails = bankdetails;
    }

    public List<Transcation> getTranscation() {
        return transcation;
    }

    public void setTranscation(List<Transcation> transcation) {
        this.transcation = transcation;
    }


}
