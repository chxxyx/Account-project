package com.example.account.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// 자동 회계관련 AutoScanning
@Configuration
@EnableJpaAuditing
public class JpaAuditingConfiguration {
}
