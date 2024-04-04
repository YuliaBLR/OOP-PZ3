package Task2;

import java.util.Comparator;

public class AgeComparator implements Comparator<Empoyee> {


    @Override
    public int compare(Empoyee o1, Empoyee o2) {
        return Integer.compare(o2.age, o1.age);
    }
}
