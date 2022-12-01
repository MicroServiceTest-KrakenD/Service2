package com.example.demo2

interface GoodbyeService {
    val users: Set<String>
    fun bye(name: String): String
}