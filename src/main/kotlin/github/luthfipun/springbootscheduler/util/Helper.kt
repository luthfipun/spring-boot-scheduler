package github.luthfipun.springbootscheduler.util

import java.text.SimpleDateFormat
import java.util.*

fun log(message: String) {
    println("INFO : $message | ${time()}")
}

fun time(): String{
    val formatter = SimpleDateFormat("dd-MM-yyyy HH:mm:ss")
    return formatter.format(Date())
}