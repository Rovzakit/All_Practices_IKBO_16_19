package Practice15_16;

public class Tester {
    public static void main(String[] args) throws InterruptedException {
        Person person=new Person("Alex");
        ATM atm1=new ATM(person.getMyAccount());
        ATM atm2=new ATM(person.getMyAccount());
        ATM atm3=new ATM(person.getMyAccount());
        Thread atmChild1 = new Thread(atm1,"atm1");
        Thread atmChild2 = new Thread(atm2,"atm2");
        Thread atmChild3 = new Thread(atm3,"atm3");
        atmChild1.start();
        atmChild2.start();
        atmChild3.start();
    }
}
