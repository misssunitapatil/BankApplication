package com.bank.server.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class BankLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bankLocation;
    private String city;
    private String state;
    private String country;
    @OneToOne
     BankDetails bankdetails;

    public int getBankLocation() {
        return bankLocation;
    }

    public void setBankLocation(int bankLocation) {
        this.bankLocation = bankLocation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public BankDetails getBankdetails() {
        return bankdetails;
    }

    public void setBankdetails(BankDetails bankdetails) {
        this.bankdetails = bankdetails;
    }
}
