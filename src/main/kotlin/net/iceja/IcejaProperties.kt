package net.iceja

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties("net.iceja.application")
data class IcejaProperties(
    val name: String? = "Iceja website app"
)
