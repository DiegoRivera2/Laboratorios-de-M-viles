package com.example.laboratorio11.network.dto.register

import java.io.StringReader

// TODO: Create RegisterRequest data class
data class RegisterRequest(
    val name: String,
    val email: String,
    val password: String
)