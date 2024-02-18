import org.example.FizzBuzz
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MainKtTest{
    @Test
    fun `print 1 for the input 1`(){
        val fizzBuzz = FizzBuzz()
        val ans = fizzBuzz.printNumber(1)
        assertEquals("1", ans)
    }

    @Test
    fun `print 2 for the input 2`(){
        val fizzBuzz = FizzBuzz()
        val ans = fizzBuzz.printNumber(2)
        assertEquals("2", ans)
    }

    @Test
    fun `print Fizz for multiples of 3`(){
        val fizzBuzz = FizzBuzz()
        val ans = fizzBuzz.printNumber(3)
        assertEquals("Fizz", ans)
    }

}