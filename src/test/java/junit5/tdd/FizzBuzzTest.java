package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_1_when_play_fizz_buzz_given_1(){
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();
        int number=1;
        //when
        String result=fizzBuzz.play(number);
        //then
        assertEquals("1",result);
    }
}
