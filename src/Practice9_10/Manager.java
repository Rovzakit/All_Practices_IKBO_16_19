package Practice9_10;

import java.util.Random;

public class Manager extends Employee implements EmployeePosition{
    private int personalIncome;
    public Manager(String firstName,String lastName) {
        super(firstName, lastName);
        Random random= new Random();
        personalIncome=random.nextInt(140-115+1);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getJobTitle() {
        return ("Manager");
    }

    @Override
    public double calcWage(double baseWage) {

        return (baseWage +(personalIncome*1000)*0.05);
    }


    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }
}
