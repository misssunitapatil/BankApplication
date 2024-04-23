package com.bank.server.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Transcation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transcationId;
    private float transcationAmount;
    private String transcationStatus;
    private String transcationDate;
    private String transcationTime;
    @ManyToOne
    private Account account;

    public int getTranscationId() {
        return transcationId;
    }

    public void setTranscationId(int transcationId) {
        this.transcationId = transcationId;
    }

    public float getTranscationAmount() {
        return transcationAmount;
    }

    public void setTranscationAmount(float transcationAmount) {
        this.transcationAmount = transcationAmount;
    }

    public String getTranscationStatus() {
        return transcationStatus;
    }

    public void setTranscationStatus(String transcationStatus) {
        this.transcationStatus = transcationStatus;
    }

    public String getTranscationDate() {
        return transcationDate;
    }

    public void setTranscationDate(String transcationDate) {
        this.transcationDate = transcationDate;
    }

    public String getTranscationTime() {
        return transcationTime;
    }

    public void setTranscationTime(String transcationTime) {
        this.transcationTime = transcationTime;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}