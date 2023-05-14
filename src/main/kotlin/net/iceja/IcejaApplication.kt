package net.iceja

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(IcejaProperties::class)
class IcejaApplication

fun main(args: Array<String>) {
    runApplication<IcejaApplication>(*args)
}
