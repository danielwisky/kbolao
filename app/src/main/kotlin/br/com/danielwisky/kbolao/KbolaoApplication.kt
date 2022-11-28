package br.com.danielwisky.kbolao

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KbolaoApplication

fun main(args: Array<String>) {
	runApplication<KbolaoApplication>(*args)
}
