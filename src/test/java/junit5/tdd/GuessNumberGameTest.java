package junit5.tdd;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

public class GuessNumberGameTest {
    private AnswerGenerate AnswerGenerate;

    @Test
    void should_return_4A0B_when_guess_number_given_1234(){
        //given
        AnswerGenerate mockedAnswerGenerate=Mockito.mock(AnswerGenerate.class);
        given(mockedAnswerGenerate.generateAnswer()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate.generateAnswer());
        //when
        String result=guessNumberGame.guess();
        //then
        assertEquals("4A0B",result);
    }
    @Test
    void should_return_0A0B_when_guess_number_given_5678(){
        //given
        GuessNumberGame guessNumberGame = new GuessNumberGame("5678");
        //when
        String result=guessNumberGame.guess();
        //then
        assertEquals("0A0B",result);
    }
    @Test
    void should_return_3A0B_when_guess_number_given_1235(){
        //given
        GuessNumberGame guessNumberGame = new GuessNumberGame("1235");
        //when
        String result=guessNumberGame.guess();
        //then
        assertEquals("3A0B",result);
    }
}
