package com.bank.server.Repository;

import com.bank.server.Entities.BankLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankLocationRepository extends JpaRepository<BankLocation,Integer>
{
}
