package github.luthfipun.springbootscheduler

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class SpringBootSchedulerApplication

fun main(args: Array<String>) {
    runApplication<SpringBootSchedulerApplication>(*args)
}
