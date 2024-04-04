package Task2;

/**
 * Рабочий (работает с 9 до 18,
 * получает фиксированную заработную плату
 * */
public class Worker extends Empoyee{

    private Worker(String name, String surName, int age, double salary) {
        super(name, surName, age, salary);
    }

    public static Worker createWorker (String name, String surName, int age, double salary){
        return new Worker(name, surName, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Работник  | %s %s; возраст: %d; ставка: %.2f руб.; заработная плата: %.2f руб.",
                surName, name, age, salary, calculateSalary());
    }
}
