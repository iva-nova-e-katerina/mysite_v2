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
import org.springframework.web.servlet.view.InternalResourceViewResolver
import org.springframework.web.servlet.view.JstlView
import org.springframework.web.servlet.view.UrlBasedViewResolver


@SpringBootApplication
@EnableConfigurationProperties(IcejaProperties::class)
class IcejaApplication{

    @Bean
    fun resolver (): org.springframework.web.servlet.view.UrlBasedViewResolver {
        val res: UrlBasedViewResolver = org.springframework.web.servlet.view.UrlBasedViewResolver()
        res.isCache = false
        res.setViewClass(XhtmlView::class.java)
        res.setPrefix("/WEB-INF/")
        res.setSuffix(".xhtml")
        return res
    }
}

fun main(args: Array<String>) {
    runApplication<IcejaApplication>(*args)
}
