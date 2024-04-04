package Task2;

/**
 * Фрилансер (работает с почасовой оплатой)
 */

public class Freelancer extends Empoyee{


    private Freelancer(String name, String surName, int age, double salary) {
        super(name, surName, age,salary);
    }

    public static Freelancer createFreelancer (String name, String surName, int age, double salary){
        return new Freelancer(name, surName, age, salary);
    }

    @Override
    public double calculateSalary() {
        return 20.8*8*salary;
    }

    @Override
    public String toString() {
        return String.format("Фрилансер | %s %s; возраст: %d; ставка: %.2f руб.; заработная плата: %.2f руб.",
                surName, name, age, salary, calculateSalary());
    }
}
