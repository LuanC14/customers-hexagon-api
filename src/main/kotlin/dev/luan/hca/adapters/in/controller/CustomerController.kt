package dev.luan.hca.adapters.`in`.controller

import dev.luan.hca.adapters.`in`.controller.request.CreateCustomerRequest
import dev.luan.hca.application.core.extension.toCustomerDto
import dev.luan.hca.application.ports.`in`.CustomerPortIn
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/customers")
class CustomerController(
    private val customerService: CustomerPortIn
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@Valid @RequestBody request: CreateCustomerRequest) {
        with(request) {
            customerService.createCustomer(toCustomerDto(), zipCode)
        }
    }
}