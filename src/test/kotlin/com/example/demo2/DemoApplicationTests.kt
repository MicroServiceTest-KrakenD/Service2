package com.example.demo2

import org.assertj.core.api.Assertions.assertThat
import org.hamcrest.core.StringContains
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests  @Autowired constructor(
    private val service: GoodbyeService?,
    private val controller: DemoController?,
    private val mockMvc: MockMvc,
) {
    @Test
    fun contextLoads() {
        assertThat(service).isNotNull
        assertThat(controller).isNotNull
    }

    @Test
    @Throws(Exception::class)
    fun shouldReturnDefaultMessage() {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/")).andDo(MockMvcResultHandlers.print()).andExpect(
            MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string(StringContains.containsString("Bye-bye, World")))
    }
}
