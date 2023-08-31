package lesson9.animal;


public class Main {
    public static void main(String[] args) {
        Animal dog = Dog.getINSTANCE();
        dog.eat("Meet");
        dog.voice();
        Animal tiger = new Tiger();
        tiger.voice();
        Animal rabbit = new Rabbit();
        rabbit.eat("Meet");
        rabbit.voice();
    }
}