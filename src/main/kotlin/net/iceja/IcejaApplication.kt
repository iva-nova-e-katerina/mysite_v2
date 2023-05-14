/*
Copyright (c) 2023 Ivanova Ekaterina Alexeevna (iceja.net). All rights reserved.
PROPRIETARY. For demo purposes only, not for redistribution or any commercial
use.
*/
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
