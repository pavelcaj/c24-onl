package lesson6.person;

public class Main {
    public static void main(String[] args) {
        Person valody = new Person();
        Person sergey = new Person("Иванов Сергей Дмитриевич", 18);

        sergey.move();
        sergey.talk("Хочу домой");
    }

}
