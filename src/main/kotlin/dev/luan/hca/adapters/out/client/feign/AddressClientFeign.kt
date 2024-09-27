package dev.luan.hca.adapters.out.client.feign

import dev.luan.hca.adapters.out.client.feign.response.AddressResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(
    name = "address-api",
    url = "\${spring.cloud.openfeign.client.config.address-api.url}"
)
interface AddressClientFeign {

    @GetMapping("/{zipCode}")
    fun findByZipCode(@PathVariable zipCode: String): AddressResponse
}