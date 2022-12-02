package org.home.bankSpringBatch.batch;

import org.home.bankSpringBatch.dao.BankTransactionRepository;
import org.home.bankSpringBatch.entities.BankTransaction;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BankTransactionItemWriter implements ItemWriter<BankTransaction> {
    @Autowired
    private BankTransactionRepository bankTransactionRepository;
    @Override
    public void write(List<? extends BankTransaction> list) throws Exception {
        this.bankTransactionRepository.saveAll(list);
    }
}
