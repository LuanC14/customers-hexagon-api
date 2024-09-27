package dev.luan.hca

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class HexagonCustomersApiApplication

fun main(args: Array<String>) {
	runApplication<HexagonCustomersApiApplication>(*args)
}
