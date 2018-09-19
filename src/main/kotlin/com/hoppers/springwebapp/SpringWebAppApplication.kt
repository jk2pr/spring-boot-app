package com.hoppers.springwebapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringWebAppApplication

fun main(args: Array<String>) {
    runApplication<SpringWebAppApplication>(*args)
}
