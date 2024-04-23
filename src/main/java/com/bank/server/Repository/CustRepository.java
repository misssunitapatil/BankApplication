package com.bank.server.Repository;

import com.bank.server.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustRepository extends JpaRepository<Customer,Integer> {
}
