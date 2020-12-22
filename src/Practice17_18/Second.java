package Practice17_18;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Second {
    public void check(){
        String regex, next;
        regex="([a-f]+[A-F]+:){3}+([0-9]{2}+:){2}+[0-9]{2}";
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        next=scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(next);
        if(matcher.matches()){
            System.out.println("true");
        }
        else System.out.println("false");
    }
}