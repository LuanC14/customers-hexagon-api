package dev.luan.hca.application.core.extension

import dev.luan.hca.adapters.`in`.controller.request.CreateCustomerRequest
import dev.luan.hca.application.core.domain.CustomerDto

fun CreateCustomerRequest.toCustomerDto(): CustomerDto {
    return CustomerDto(
        name = this.name,
        cpf = this.cpf,
        isValidCpf = false
    )
}