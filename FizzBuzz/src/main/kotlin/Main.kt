package org.example

fun main() {
    println("Hello World!")
}

class FizzBuzz{
    fun printNumber(i: Int): String {
        if(i % 3 == 0){
            return "Fizz"
        }
        return "$i"
    }

}