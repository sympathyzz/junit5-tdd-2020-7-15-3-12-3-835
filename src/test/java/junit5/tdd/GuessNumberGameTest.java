package junit5.tdd;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberGameTest {
    @Test
    void should_return_4A0B_when_guess_number_given_1234(){
        //given
        GuessNumberGame guessNumberGame = new GuessNumberGame();
        //when
        String result=guessNumberGame.guess();
        //then
        assertEquals("4A0B",result);
    }
    @Test
    void should_return_0A0B_when_guess_number_given_5678(){
        //given
        GuessNumberGame guessNumberGame = new GuessNumberGame();
        //when
        String result=guessNumberGame.guess();
        //then
        assertEquals("0A0B",result);
    }
}
