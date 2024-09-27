package dev.luan.hca.adapters.out.client.feign.response

data class AddressResponse(
    val street: String,
    val city: String,
    val state: String
) {
}