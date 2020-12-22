package Practice15_16;

public class Person {
    private String name;
    private Account myAccount;
    public Person(String name) {
        this.name = name;
        myAccount =new Account();
        this.myAccount.setBalance(7328.67);
    }

    public String getName() {
        return name;
    }

    public Account getMyAccount() {
        return myAccount;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
