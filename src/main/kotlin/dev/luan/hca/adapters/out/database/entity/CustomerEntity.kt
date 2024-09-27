package dev.luan.hca.adapters.out.database.entity

import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.MongoId


@Document(collation = "CUSTOMERS")
data class CustomerEntity(
    @MongoId
    val id: String?,
    val name: String,
    val address: AddressEntity,
    val cpf: String,
    val isValidCpf: Boolean = false
)
