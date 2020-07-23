package junit5.tdd;

public class NumberFilter {
    private String input;
    public NumberFilter(String input) {
        this.input=input;
    }

    public String filter() {
        if(input.equals("1234")){
            return "pass";
        }
        return "Wrong Input,Input again";
    }
}
