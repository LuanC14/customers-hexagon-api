package dev.luan.hca

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HexagonCustomersApiApplication

fun main(args: Array<String>) {
	runApplication<HexagonCustomersApiApplication>(*args)
}
