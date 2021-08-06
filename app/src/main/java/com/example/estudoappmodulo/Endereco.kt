package com.example.estudoappmodulo

import java.io.Serializable

data class Endereco(
    val rua: String,
    val bairro: String,
    val municipio: String,
    val estado: String
): Serializable