package Task2;

import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Empoyee generateOneEmployee(){
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Михаил", "Алексей"};
        String[] surNames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Иванов", "Солнцев", "Партизанов"};
        int salary = random.nextInt(60001, 120001);
        int age = random.nextInt(18, 51);
        int temp = random.nextInt(2);
        if (temp == 0){
            return Worker.createWorker(
                surNames[random.nextInt(surNames.length)],
                names[random.nextInt(names.length)],
                age,
                salary);
        }else{
            return Freelancer.createFreelancer(
                    surNames[random.nextInt(surNames.length)],
                    names[random.nextInt(names.length)],
                    age,
                    salary);
        }

    }

    public static Empoyee[] generateEmployees(int count){
        Empoyee[] empoyees = new Empoyee[count];
        for (int i = 0; i < count; i++) {
            empoyees[i] = generateOneEmployee();
        }
        return empoyees;
    }
}
