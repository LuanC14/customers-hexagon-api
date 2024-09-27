package dev.luan.hca.application.ports.out

import dev.luan.hca.application.core.domain.AddressDto

interface AddressManagerPortOut {

    fun find(zipCode: String): AddressDto
}