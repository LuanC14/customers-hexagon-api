package dev.luan.hca.application.core.service

import dev.luan.hca.application.core.domain.CustomerDto
import dev.luan.hca.application.ports.`in`.CustomerPortIn
import dev.luan.hca.application.ports.out.AddressManagerPortOut
import dev.luan.hca.application.ports.out.DatabasePortOut
import org.springframework.stereotype.Service

class CustomerService(
    private val addressManagerPortOut: AddressManagerPortOut,
    private val databasePortOut: DatabasePortOut
) : CustomerPortIn {

    override fun createCustomer(customer: CustomerDto, zipCode: String) {
        val address = addressManagerPortOut.find(zipCode)
        val updatedCustomer = customer.copy(address = address)
        databasePortOut.saveCustomer(updatedCustomer)
    }
}