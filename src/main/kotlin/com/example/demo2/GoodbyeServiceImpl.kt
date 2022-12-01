package com.example.demo2

import org.springframework.stereotype.Service


@Service
class GoodbyeServiceImpl : GoodbyeService {
    override val users = mutableSetOf<String>()

    override fun bye(name: String) = name.replaceFirstChar(Char::uppercaseChar).let {
        users.add(it)
        "Bye-bye, $it"
    }
}