package org.home.bankSpringBatch.batch;

import lombok.Getter;
import org.home.bankSpringBatch.entities.BankTransaction;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

//@Component
public class BankTransactionItemAnalyticsProcessor implements ItemProcessor<BankTransaction, BankTransaction> {

    @Getter
    private double totalDebit;
    @Getter
    private double totalCredit;

    @Override
    public BankTransaction process(BankTransaction bankTransaction) throws Exception {
        if(bankTransaction.getTransactionType().equals("D")) {
            this.totalDebit += bankTransaction.getAmount();
        } else if(bankTransaction.getTransactionType().equals("C")) {
            this.totalCredit += bankTransaction.getAmount();
        }
        return bankTransaction;
    }
}
