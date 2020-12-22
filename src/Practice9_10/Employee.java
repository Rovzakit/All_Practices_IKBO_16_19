package Practice9_10;

public class Employee implements EmployeePosition{
    private String lastName;
    private String firstName;

    public Employee(String name, String surname) {
        this.lastName = surname;
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getJobTitle() {
        return null;
    }

    @Override
    public double calcWage(double baseWage) {
        return baseWage;
    }

    public boolean equals(Employee o) {
        if (this.hashCode() == o.hashCode()) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return  false;
    }

    @Override
    public int hashCode() {
        return firstName.hashCode() +  lastName.hashCode();
    }
}
