package dev.luan.hca.infrastructure.config

import dev.luan.hca.adapters.out.client.feign.AddressManagerAdapter
import dev.luan.hca.adapters.out.database.DatabasePortOutAdapter
import dev.luan.hca.application.core.service.CustomerService
import org.modelmapper.ModelMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ApplicationConfig {

    @Bean
    fun modelMapper(): ModelMapper {
        return ModelMapper()
    }

    @Bean
    fun customerService(
        addressManagerAdapter: AddressManagerAdapter,
        databasePortOutAdapter: DatabasePortOutAdapter
    ): CustomerService {
        return CustomerService(addressManagerAdapter, databasePortOutAdapter)
    }
}