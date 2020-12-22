package Practice9_10;

public class TopManager extends Employee implements EmployeePosition {
    private int Income;

    public TopManager(String firstName, String lastName,int income) {
        super(firstName, lastName);
        Income = income;
    }

    @Override
    public String getJobTitle() {
        return "TopManager";
    }

    @Override
    public double calcWage(double baseWage) {
        if (Income > 100000000) {
            return baseWage + baseWage * 1.5;
        } else return baseWage;
    }
}
