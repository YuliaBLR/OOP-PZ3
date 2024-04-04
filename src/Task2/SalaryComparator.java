package Task2;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Empoyee> {

    /*@Override
    public int compare(Empoyee o1, Empoyee o2) {
        if (o1.calculateSalary() > o2.calculateSalary()){
            return -1;
        }
        if (o1.calculateSalary() == o2.calculateSalary()){
            return 0;
        }
        else{
            return 1;
        }
    }*/
    @Override
    public int compare(Empoyee o1, Empoyee o2) {
        return Double.compare(o2.calculateSalary(), o1.calculateSalary());
    }
}
