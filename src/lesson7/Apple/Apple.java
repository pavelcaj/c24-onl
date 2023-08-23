package lesson7.Apple;

import java.lang.reflect.Field;

public class Apple {
    String color = "Green";
    public void changeMyPrivateField(String newValue) throws NoSuchFieldException, IllegalAccessException {
        Field field = Apple.class.getDeclaredField("color");
        field.setAccessible(true);
        field.set(this, newValue);
    }
}

