package ru.rustam.otus.dz2.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EntityScan(basePackages = {"ru.rustam.otus.dz2.db"})
public class PersistenceJPAConfig {
}
