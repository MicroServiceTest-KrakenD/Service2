package com.example.demo2

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.*


@RestController
@RequestMapping("api")
class DemoController {
    @GetMapping("/")
    fun bye(@RequestParam(required = false) name: String = "World")
        = "Bye-bye, $name"
}