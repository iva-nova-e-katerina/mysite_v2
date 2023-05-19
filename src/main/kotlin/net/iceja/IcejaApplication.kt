/*
Copyright (c) 2023 Ivanova Ekaterina Alexeevna (iceja.net). All rights reserved.
PROPRIETARY. For demo purposes only, not for redistribution or any commercial
use.
*/
package net.iceja

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.servlet.LocaleResolver
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.servlet.i18n.CookieLocaleResolver
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor
import org.springframework.web.servlet.i18n.SessionLocaleResolver
import java.util.*


@SpringBootApplication
@EnableConfigurationProperties(IcejaProperties::class)
class IcejaApplication : WebMvcConfigurer {
    @Bean
    fun localeResolver(): LocaleResolver? {
        val slr = CookieLocaleResolver()
        slr.setDefaultLocale(Locale.US)
        return slr
    }

    @Bean
    fun localeChangeInterceptor(): LocaleChangeInterceptor? {
        val lci = LocaleChangeInterceptor()
        lci.paramName = "lang"
        return lci
    }

    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(localeChangeInterceptor()!!)
    }

}

fun main(args: Array<String>) {
    runApplication<IcejaApplication>(*args)
}
