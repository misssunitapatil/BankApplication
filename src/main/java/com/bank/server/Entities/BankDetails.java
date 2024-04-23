package com.bank.server.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class BankDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int branchId;
    private String bankName;
    private String bankIfsc;
    @OneToOne(mappedBy = "bankdetails")
    BankLocation bankLocation;

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankIfsc() {
        return bankIfsc;
    }

    public void setBankIfsc(String bankIfsc) {
        this.bankIfsc = bankIfsc;
    }

    public BankLocation getBankLocation() {
        return bankLocation;
    }

    public void setBankLocation(BankLocation bankLocation) {
        this.bankLocation = bankLocation;
    }
}
