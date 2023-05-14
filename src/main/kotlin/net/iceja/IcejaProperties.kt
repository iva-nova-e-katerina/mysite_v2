/*
Copyright (c) 2023 Ivanova Ekaterina Alexeevna (iceja.net). All rights reserved.
PROPRIETARY. For demo purposes only, not for redistribution or any commercial
use.
*/
package net.iceja

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties("net.iceja.application")
data class IcejaProperties(
    val name: String? = "Iceja website app"
)
