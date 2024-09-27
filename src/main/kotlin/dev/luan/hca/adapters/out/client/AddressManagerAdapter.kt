package dev.luan.hca.adapters.out.client

import dev.luan.hca.adapters.out.client.feign.AddressClientFeign
import dev.luan.hca.adapters.out.client.feign.response.AddressResponse
import dev.luan.hca.application.core.domain.AddressDto
import dev.luan.hca.application.ports.out.AddressManagerPortOut
import org.modelmapper.ModelMapper
import org.springframework.stereotype.Component

@Component
class AddressManagerAdapter(
    private val addressClientFeign: AddressClientFeign,
    private var mapper: ModelMapper
) : AddressManagerPortOut {

    override fun find(zipCode: String): AddressDto {
        val addressResponse: AddressResponse = addressClientFeign.findByZipCode(zipCode)
        return mapper.map(addressResponse, AddressDto::class.java);
    }
}