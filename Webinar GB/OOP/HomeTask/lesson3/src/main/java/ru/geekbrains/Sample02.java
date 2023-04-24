package ru.geekbrains;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Sample02 {

    private static final Random random = new Random();

    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь",
                                        "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов",
                                            "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(200, 300);
        int index = random.nextInt(30, 50);
        int age = random.nextInt(22,39);
        int time = random.nextInt(30,45);
            int rand = random.nextInt(2);
            if(rand == 0){
                return new Worker(names[random.nextInt(10)],
                                  surnames[random.nextInt(10)],
                            salary * index,
                                  age);
            }

                return new Freelancer(names[random.nextInt(10)],
                                      surnames[random.nextInt(10)],
                                      salary,
                                      age,
                                      time);
        }


    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++)
            employees[i] = generateEmployee();

        for (Employee employee : employees){
            System.out.println(employee);
        }

        //Arrays.sort(employees, new NameComparator());
        Arrays.sort(employees, new EmployeeComparator());

        System.out.print("\n*** Отсортированный массив сотрудников ***\n\n");

        for (Employee employee : employees){
            System.out.println(employee);
        }


    }

}
class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1 instanceof Worker && e2 instanceof Freelancer) {
            return -1;
        } else if (e1 instanceof Freelancer && e2 instanceof Worker) {
            return 1;
        } else {
            int surnameCompare = e1.getSurName().compareTo(e2.getSurName());
            if (surnameCompare != 0) {
                return surnameCompare;
            } else {
                return Integer.compare((int) e2.calculateSalary(), (int) e1.calculateSalary());
            }
        }
    }
}


abstract class Employee implements Comparable<Employee>{

    protected String name;
    protected String surName;
    protected double salary;
    protected  int age;

    public String getSurName() {
        return surName;
    }


    public Employee(String name, String surName, double salary, int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    public abstract  double calculateSalary();

    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s; Среднемесячная заработная плата: %.2f", name, surName, salary);
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare( o.calculateSalary(), calculateSalary());
    }

}

class Worker extends Employee{

    public Worker(String name, String surName, double salary, int age) {
        super(name, surName, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary ;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Возраст: %d; Среднемесячная заработная плата" +
                            "(фиксированная месячная оплата): %.2f (руб.)",surName, name,  age, salary);
    }
}

class Freelancer extends Employee{
    private final int time; // Количество ОБЩЕГО отработанного времени у фрилансера
    public Freelancer(String name, String surName, double salary, int age,int time) {

        super(name, surName, salary, age);
        this.time = time;
    }



    @Override
    public double calculateSalary() {

        return time * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер;  Возраст: %d; Отработано %d часов;  Среднемесячная заработная плата" +
                            "(фиксированная месячная оплата): %.2f (руб.)",surName, name,  age, time, calculateSalary());
    }
}