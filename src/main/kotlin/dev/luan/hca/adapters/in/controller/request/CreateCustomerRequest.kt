package dev.luan.hca.adapters.`in`.controller.request

import jakarta.validation.constraints.NotBlank

data class CreateCustomerRequest(

    @field:NotBlank(message = "Name must no be blank")
    val name: String,

    @field:NotBlank(message = "CPF must no be blank")
    val cpf: String,

    @field:NotBlank(message = "Zip Code must no be blank")
    val zipCode: String
)