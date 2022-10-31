package com.example.account.dto;


import com.example.account.domain.Transaction;
import com.example.account.type.TransactionResultType;
import com.example.account.type.TransactionType;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionDto {
    private String accountNumber; // 문자열로 된 넘버만 가져옴 (account entity 말고 )
    private TransactionType transactionType;
    private TransactionResultType transactionResultType;
    private Long amount; // 거래 금액
    private Long balanceSnapshot; // 현재 밸런스의 스냅샷
    private String transactionId;
    private LocalDateTime transactedAt;


    public static TransactionDto fromEntity(Transaction transaction) {
        return TransactionDto.builder()
                .accountNumber(transaction.getAccount().getAccountNumber())
                .transactionType(transaction.getTransactionType())
                .transactionResultType(transaction.getTransactionResultType())
                .amount(transaction.getAmount())
                .balanceSnapshot(transaction.getBalanceSnapshot())
                .transactionId(transaction.getTransactionId())
                .transactedAt(transaction.getTransactedAt())
                .build();
    }
}
