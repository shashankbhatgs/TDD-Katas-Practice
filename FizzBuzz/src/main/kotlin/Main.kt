package org.example

fun main() {
    println("Hello World!")
}

class FizzBuzz{
    fun printNumber(i: Int): String {
        if(i % 3 == 0 && i % 5 == 0){
            return "FizzBuzz"
        }
        if(i % 3 == 0){
            return "Fizz"
        }
        if(i % 5 == 0){
            return "Buzz"
        }
        return "$i"
    }

}