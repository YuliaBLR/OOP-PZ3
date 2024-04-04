package Task2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {


        Empoyee[] employees = EmployeeFabric.generateEmployees(15);
        for (Empoyee e: employees) {
            System.out.println(e);
        }

        System.out.println();
        System.out.println("***");
        System.out.println();

        Arrays.sort(employees, new AgeComparator());

        for (Empoyee e: employees) {
            System.out.println(e);
        }
    }
}
