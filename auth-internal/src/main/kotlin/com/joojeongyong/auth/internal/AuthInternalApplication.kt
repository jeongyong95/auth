package com.joojeongyong.auth.internal

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AuthInternalApplication

fun main(args: Array<String>) {
    runApplication<AuthInternalApplication>(*args)
}
