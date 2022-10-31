package com.example.account.dto;

import lombok.*;

import java.util.List;
import java.util.stream.Collector;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountInfo { // account의 특정 정보들을 사용자에게 응답 (client <-> application(controller))

    private String accountNumber;
    private Long balance;

}
