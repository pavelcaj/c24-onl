package lesson9.animal;

public class Dog implements Animal {
    static Dog INSTANCE;
    private Dog(){

    }
    public static Dog getINSTANCE(){
        if(INSTANCE == null){
            INSTANCE = new Dog();
        }
        return INSTANCE;
    }
    @Override
    public void voice() {

    }

    @Override
    public void eat(String food) {
        if (food.equals("Meet")) {
            System.out.println("Dog eat Meet");
        } else {
            System.out.println("Rabbit dont eat " + food);
        }
    }
}
