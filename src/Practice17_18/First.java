package Practice17_18;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class First {
    public void check(){
        String correct, next;
        correct="abcdefghijklmnopqrstuv18340";
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        next=scanner.nextLine();
        Pattern pattern = Pattern.compile(correct);
        Matcher matcher = pattern.matcher(next);
        if(matcher.matches()){
            System.out.println("true");
        }
        else System.out.println("false");
    }
}
