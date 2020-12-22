package Practice9_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Company {
    private int baseWage;
    private int Income;
    private ArrayList<Employee> employees =new ArrayList<Employee>();
    public Company() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите фиксированный оклад: ");
        baseWage =scanner.nextInt();
        System.out.println("Введите прибыль компании: ");
        Income=scanner.nextInt();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public int getBaseWage() {
        return baseWage;
    }

    public int getIncome(){
        return Income;
    }
    public void hire(ArrayList<Employee> employees){
        String firstName,lastName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        firstName=scanner.nextLine();
        System.out.println("Введите фамилию: ");
        lastName=scanner.nextLine();
        for (int i=0;i<employees.size();i++){
            if (firstName.equals(employees.get(i).getFirstName())){
                if (lastName.equals(employees.get(i).getLastName())){
                    this.employees.add(employees.get(i));
                }
            }
        }
    }
    public List<Employee> getTopWageStaff(int count) {
        List<Employee> wage = new ArrayList<>();
        for (int i = 0; i < this.employees.size(); i++)
            for (int j = 0; j < this.employees.size()-1; j++) {
                if (this.employees.get(j).calcWage(baseWage) < this.employees.get(j+1).calcWage(baseWage)) {
                    Collections.swap(employees,j,j+1);
                }
            }
        wage.add(employees.get(0));
        int k=0;
        for (int i = 1; i<this.employees.size(); i++) {
            for (Employee empoley : wage) {
                if (empoley.calcWage(baseWage) == employees.get(i).calcWage(baseWage))
                    k++;
            }
            if (k==0)
                wage.add(employees.get(i));
            k=0;
        }
        return  wage.subList(0,count);
    }
    public List<Employee> getLowestWageStaff(int count) {
        List<Employee> wage = new ArrayList<>();
        for (int i = 0; i < this.employees.size(); i++)
            for (int j = 0; j < this.employees.size()-1; j++) {
                if (this.employees.get(j).calcWage(baseWage) > this.employees.get(j+1).calcWage(baseWage)) {
                    Collections.swap(employees,j,j+1);
                }
            }
        wage.add(employees.get(0));
        int k=0;
        for (int i = 1; i<this.employees.size(); i++) {
            for (Employee employee : wage) {
                if (employee.calcWage(baseWage) == employees.get(i).calcWage(baseWage))
                    k++;
            }
            if (k==0)
                wage.add(employees.get(i));
            k=0;
        }
        return  wage.subList(0,count);

    }

    public void hireAll(ArrayList<Employee> employees){
        this.employees.addAll(employees);
    }
    public void fire(String firstName,String lastName){
        for (int i = 0; i< employees.size(); i++){
            boolean valve =this.employees.get(i).equals(new Employee(firstName,lastName));
            if (valve)
                this.employees.remove(i);
        }
    }
}
