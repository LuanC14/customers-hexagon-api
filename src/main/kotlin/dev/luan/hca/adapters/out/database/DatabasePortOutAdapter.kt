package dev.luan.hca.adapters.out.database

import dev.luan.hca.adapters.out.database.entity.CustomerEntity
import dev.luan.hca.application.core.domain.CustomerDto
import dev.luan.hca.application.ports.out.DatabasePortOut
import org.modelmapper.ModelMapper
import org.springframework.stereotype.Component

@Component
class DatabasePortOutAdapter(
    private val customerRepository: CustomerRepository,
    private val modelMapper: ModelMapper
) : DatabasePortOut {

    override fun saveCustomer(customer: CustomerDto) {
        val customerEntity = modelMapper.map(customer, CustomerEntity::class.java)
        customerRepository.save(customerEntity)
    }
}