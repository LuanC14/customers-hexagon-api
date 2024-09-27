package dev.luan.hca.adapters.out.database

import dev.luan.hca.adapters.out.database.entity.CustomerEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: MongoRepository<CustomerEntity, String> {
}