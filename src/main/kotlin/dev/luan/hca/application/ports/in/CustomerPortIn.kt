package dev.luan.hca.application.ports.`in`

import dev.luan.hca.application.core.domain.CustomerDto

interface CustomerPortIn {

    fun createCustomer(customer: CustomerDto, zipCode: String)
}