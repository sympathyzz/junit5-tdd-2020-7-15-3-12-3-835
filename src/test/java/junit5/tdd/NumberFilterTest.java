package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NumberFilterTest {
    @Test
    void should_return_wrong_input_when_filter_number_given_12(){
        //given
        String input="12";
        NumberFilter filter=new NumberFilter();
        //when
        String output=filter.filter();
        //then
        assertEquals("Wrong Input,Input again",output);
    }
    @Test
    void should_return_pass_when_filter_number_given_1234(){
        //given
        String input="1234";
        NumberFilter filter=new NumberFilter();
        //when
        String output=filter.filter();
        //then
        assertEquals("pass",output);
    }
}
