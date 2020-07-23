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

    @Test
    void should_return_fizz_when_play_fizz_buzz_given_3(){
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();
        int number=3;
        //when
        String result=fizzBuzz.play(number);
        //then
        assertEquals("fizz",result);
    }

    @Test
    void should_return_buzz_when_play_fizz_buzz_given_5(){
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();
        int number=5;
        //when
        String result=fizzBuzz.play(number);
        //then
        assertEquals("buzz",result);
    }
}
