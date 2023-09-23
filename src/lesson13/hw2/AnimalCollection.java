package lesson13.hw2;
/**
 Создать класс, который будет хранить в себе коллекцию с названиями животных.
 Реализовать методы удаления и добавления животных по следующим правилам:
 добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
 объекта этого класса в main методе другого класса.
 */

import java.util.LinkedList;

public class AnimalCollection {
    private LinkedList<String> animalList;

    public AnimalCollection() {
        animalList = new LinkedList<>();
    }


    public void addAnimal(String animalName) {
        animalList.addFirst(animalName);
    }

    public String removeAnimal() {
        if (animalList.isEmpty()) {
            return "Коллекция пуста";
        } else {
            return animalList.removeLast();
        }
    }


    public void displayCollection() {
        System.out.println("Список животных: " + animalList);
    }

    public static void main(String[] args) {
        AnimalCollection animalCollection = new AnimalCollection();

        animalCollection.addAnimal("Лев");
        animalCollection.addAnimal("Тигр");
        animalCollection.addAnimal("Зебра");

        System.out.println("Исходное состояние коллекции:");
        animalCollection.displayCollection();

        String removedAnimal = animalCollection.removeAnimal();
        System.out.println("Удалено животное: " + removedAnimal);

        System.out.println("Состояние коллекции после удаления:");
        animalCollection.displayCollection();

        animalCollection.addAnimal("Лев");
        animalCollection.addAnimal("Куала");
        animalCollection.addAnimal("Заяц");

        System.out.println("Состояние коллекции после добавления:");
        animalCollection.displayCollection();
    }
}
