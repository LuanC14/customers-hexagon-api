package dev.luan.hca.adapters.out.client

import dev.luan.hca.adapters.out.client.feign.AddressClientFeign
import dev.luan.hca.adapters.out.client.feign.response.AddressResponse
import org.springframework.cloud.openfeign.FallbackFactory
import org.springframework.stereotype.Component

@Component
class FallbackAddressManager : FallbackFactory<AddressClientFeign> {
    override fun create(cause: Throwable?): AddressClientFeign {
        return object : AddressClientFeign {
            override fun findByZipCode(zipCode: String): AddressResponse {
                throw RuntimeException("Internal Server Error")
            }

        }
    }
}