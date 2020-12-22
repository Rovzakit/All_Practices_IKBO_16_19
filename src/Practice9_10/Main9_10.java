package Practice9_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main9_10 {
    public static void main(String[] args) {
        Random random = new Random();
        int k = 0;
        int l = 1;
        ArrayList<Employee> workers = new ArrayList<Employee>();
        ArrayList<Employee> wage = new ArrayList<Employee>();
        Company comp = new Company();
        while (k < 180) {
            Employee employee = new Operator("Jhon", "Sir" + toString(l));
            workers.add(employee);
            l++;
            k++;
        }
        k = 0;
        while (k < 80) {
            Employee employee = new Manager("Jhon", "Sir" + toString(l));
            workers.add(employee);
            l++;
            k++;
        }
        k = 0;
        while (k < 10) {
            Employee employee = new TopManager("Jhon", "Sir" + toString(l), comp.getIncome());
            workers.add(employee);
            l++;
            k++;
        }
        comp.hireAll(workers);
        List<Employee> comp1 = comp.getTopWageStaff(1);
        for (int i = 0; i < 1; i++) {
            System.out.println((i + 1) + ".  " + comp1.get(i).calcWage(comp.getBaseWage()) + "руб");
        }
        System.out.println();
        List<Employee> comp2 = comp.getLowestWageStaff(1);
        for (int i = 0; i < 1; i++) {
            System.out.println((i + 1) + ".  " + comp2.get(i).calcWage(comp.getBaseWage()) + "руб");
        }
        for (int i = 0; i < (workers.size()/2); i++) {
            comp.fire("Jhon", "Sir" + toString(random.nextInt(30)));
        }
        ArrayList<Employee> workersAfterFire = new ArrayList<Employee>((workers.size()/2));
        workersAfterFire=comp.getEmployees();
        System.out.println();
        k=0;
        for (Employee employee : workersAfterFire) {
            if (employee != null && employee.getLastName()!= null) {
                k++;
                System.out.println((k) + ".  " + employee.getLastName());
            }
        }
    }
    private static String toString(int k) {
        return Integer.toString(k);
    }
}
