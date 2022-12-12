package com.example.demo2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class GoodbyeServiceTest @Autowired constructor(
    private val service: GoodbyeService,
) {

    @Test
    fun getUsers() {
        val list = listOf("TestName1", "TesT NaMe 2", "3")
        list.forEach { service.bye(it) }
        assertThat(service.users).containsAll(list)
    }

    @Test
    fun bye() {
        val name = "testName"
        assertEquals(service.bye(name), "Bye-bye, TestName")
    }
}