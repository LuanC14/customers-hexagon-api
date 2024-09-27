package dev.luan.hca.application.core.domain

data class CustomerDto(
    val id: String? = null,
    val name: String,
    val address: AddressDto? = null,
    val cpf: String,
    val isValidCpf: Boolean = false
)
