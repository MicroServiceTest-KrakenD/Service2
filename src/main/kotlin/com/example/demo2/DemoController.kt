package com.example.demo2

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.*


@RestController
@RequestMapping("api")
class DemoController @Autowired constructor(
    private val service: GoodbyeService,
) {
    @GetMapping("")
    fun bye(@RequestParam(required = false, defaultValue="World") name: String)
        = service.bye(name)

    @GetMapping("list")
    fun list() = service.users
}