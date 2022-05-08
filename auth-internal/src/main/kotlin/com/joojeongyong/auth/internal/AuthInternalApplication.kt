package com.joojeongyong.auth.internal

import com.joojeongyong.auth.core.configuration.PostgresConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@Import(value = [PostgresConfig::class])
@SpringBootApplication
class AuthInternalApplication

fun main(args: Array<String>) {
    runApplication<AuthInternalApplication>(*args)
}
