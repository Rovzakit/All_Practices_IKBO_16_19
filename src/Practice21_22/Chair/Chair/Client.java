package Chair;

import java.util.Scanner;

public class Client implements Chair {
    private Chair chair;

    public Client() {
        System.out.println("Выберите стул:");
        System.out.println("1.Викторианский стул");
        System.out.println("2.Многофункциональный стул;");
        System.out.println("3.Магический стул");
        int a;
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        if (a==1){
            Factory factory = new Victorian_Chairs_Factory();
            chair= factory.createChair();
        }
        else  if (a==2){
            Factory factory = new Multiple_Function_Chairs_Factory();
            chair= factory.createChair();
        }
        else  if (a==3){
            Factory factory = new Magic_Chairs_Factory();
            chair= factory.createChair();
        }
    }

    @Override
    public void sit() {
        chair.sit();
    }
}
