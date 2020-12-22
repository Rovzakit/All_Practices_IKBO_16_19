package Practice19_20;

import java.util.Scanner;

public class Main19_20 {
    public static void main(String[] args) {
        Generate generate= new Generate();
        generate.nicePlates();
        Scanner scanner= new Scanner(System.in);
        generate.search("А000АА199");
    }
}
