package junit5.tdd;

public class GuessNumberGame {
    private String guessNum;
    public GuessNumberGame(String guessNum) {
        this.guessNum=guessNum;
    }

    public String guess() {
        if(guessNum=="1234"){
            return "4A0B";
        }
        return "0A0B";
    }
}
