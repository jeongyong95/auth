package com.joojeongyong.auth.core.configuration

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.data.transaction.ChainedTransactionManager
import org.springframework.transaction.PlatformTransactionManager
import org.springframework.transaction.TransactionManager
import org.springframework.transaction.annotation.TransactionManagementConfigurer
import javax.sql.DataSource

@Configuration
class PostgresConfig : TransactionManagementConfigurer {
    private val transactionManager: PlatformTransactionManager? = null

    @Bean
    @ConfigurationProperties(value = "spring.datasource.hikari")
    fun hikariConfig(): HikariConfig {
        return HikariConfig()
    }

    @Bean
    fun dataSource(): DataSource {
        return HikariDataSource(this.hikariConfig())
    }

    @Bean
    fun chainedTransactionManager(): PlatformTransactionManager {
        return ChainedTransactionManager(transactionManager)
    }

    override fun annotationDrivenTransactionManager(): TransactionManager {
        return chainedTransactionManager()
    }
}