package com.bank.server.Repository;

import com.bank.server.Entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccRepository extends JpaRepository<Account,Integer> {
}
