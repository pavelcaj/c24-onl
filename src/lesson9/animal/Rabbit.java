package lesson9.animal;

public class Rabbit implements Animal{
    @Override
    public void voice() {
        System.out.println("Rabbit say ppipipi");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Grass")) {
            System.out.println("Rabbit eat Grass");
        } else {
            System.out.println("Rabbit dont eat " + food);
        }
    }
}
