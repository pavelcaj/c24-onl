package lesson9.animal;

public class Tiger implements Animal {
    @Override
    public void voice() {
        System.out.println("Tiger say rrrrr ");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Meet")) {
            System.out.println("Tiger eat Meet");
        } else {
            System.out.println("Tiger dont eat " + food);
        }
    }
}
