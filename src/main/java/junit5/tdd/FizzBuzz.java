package junit5.tdd;

public class FizzBuzz {
    public String play(int number){
        if(number%3==0){
            return "fizz";
        }
        if(number%5==0){
            return "buzz";
        }
        return String.valueOf(number);
    }
}
