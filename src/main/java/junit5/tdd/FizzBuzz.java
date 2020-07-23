package junit5.tdd;

import com.google.common.base.Strings;

public class FizzBuzz {
    public String play(int number){
        String result= "";
        if(number%3==0){
            result+="fizz";
        }
        if(number%5==0){
            result+="buzz";
        }
        if(result.isEmpty()){
            result= String.valueOf(number) ;
        }
        return result;
    }
}
