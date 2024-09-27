package dev.luan.hca.application.ports.out

import dev.luan.hca.application.core.domain.CustomerDto
import org.springframework.stereotype.Repository

interface DatabasePortOut {

    fun saveCustomer (customer: CustomerDto)
}