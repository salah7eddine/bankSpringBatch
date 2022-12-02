package org.home.bankSpringBatch.dao;

import org.home.bankSpringBatch.entities.BankTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankTransactionRepository extends JpaRepository<BankTransaction, Long> {
}
