package com.bank.server.Repository;

import com.bank.server.Entities.Transcation;
import com.bank.server.Servcies.TranscationService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transcation,Integer> {
}
