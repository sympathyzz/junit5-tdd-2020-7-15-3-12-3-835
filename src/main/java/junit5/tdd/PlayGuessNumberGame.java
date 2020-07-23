package junit5.tdd;

import java.util.Scanner;

public class PlayGuessNumberGame {


    public static void main(String[] args) {
        GenerateRightFormatAnswer generateRightFormatAnswer=new GenerateRightFormatAnswer();


        String answer=generateRightFormatAnswer.generateAnswer();
        Scanner scanner=new Scanner(System.in);
        System.out.println("四位数字答案已生成，请输入你要猜的数字：");
        int guessNum=scanner.nextInt();
        String guessStringNum=guessNum+"";
        NumberFilter numberFilter=new NumberFilter(guessStringNum);
        if(numberFilter.filter().equals("Pass")){
            GuessNumberGame guessNumberGame=new GuessNumberGame(guessStringNum);
            String result=guessNumberGame.guess();

        }
    }

}
