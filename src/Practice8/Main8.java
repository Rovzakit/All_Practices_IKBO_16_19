package Practice8;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        FurnitureShop store = new FurnitureShop();
        while(true){
            String command =new Scanner(System.in).nextLine();
            store.Commands(command);
        }
    }
}
