package ru.geekbrains.sample01;

import java.util.ArrayList;

/**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
 */
public class Homework {
    public static void main(String[] args) {
        //Создаём коробку с яблоками из 7 штук (один из конструкторов позволяет сразу добавлять определённое количество)
        Box<Apple> apples = new Box<>(7 ,new Apple());
        System.out.println(apples.getWeight());
        //Добавляем ещё яблоко в коробку
        apples.addFruit(new Apple());
        System.out.println(apples.getWeight());

        //Создаём коробку из 5ти апельсинов
        Box<Orange> oranges = new Box<>(5 ,new Orange());
        System.out.println(oranges.getWeight());
        //Добавляем ещё апельсин в коробку
        oranges.addFruit(new Orange());
        System.out.println(oranges.getWeight());

        //Сравниваем вес коробок
        System.out.println(oranges.compare(apples));
        //Добавим яблоко в коробку, чтобы вес стал одинаковый
        apples.addFruit(new Apple());
        System.out.println(oranges.compare(apples));

        //Создаём вторую коробку из 20ти апельсинов
        Box<Orange> oranges2 = new Box<>(20 ,new Orange());
        System.out.println(oranges2.getWeight());
        //Пересыпаем апельсины из одной коробки в другую и проверяем вес
        oranges2.pourOut(oranges);
        System.out.println(oranges2.getWeight());
        System.out.println(oranges.getWeight());


    }
}

abstract class Fruit{

    private final float weight;

    public float getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }
}

class Apple extends Fruit{

    public Apple() {
        super(1.0f);
    }
}

class Orange extends Fruit{

    public Orange() {super(1.5f);}
}

class Box<T extends Fruit>{

    ArrayList<T> fruits;

    public Box(T fruit) {
        fruits = new ArrayList<T>();
    }

    public Box(int count, T fruit){
        fruits = new ArrayList<T>();
        for (int i = 0; i < count; i++) {
            addFruit(fruit);
        }
    }

    protected void addFruit(T fruit) {
        fruits.add(fruit);
    }

    protected double getWeight() {
        if (fruits.isEmpty()) {
            return 0.0;
        }

        double fruitWeight = fruits.get(0).getWeight();
        return fruits.size() * fruitWeight;
    }

    protected Boolean compare(Box<? extends  Fruit> anotherBox){
        return this.getWeight() == anotherBox.getWeight();
    }

    protected void pourOut(Box<T> anotherBox){
        for (T smth: this.fruits) {
            anotherBox.addFruit(smth);
        }
        this.fruits.clear();
    }

}


