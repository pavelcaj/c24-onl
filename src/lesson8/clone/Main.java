package lesson8.clone;

public class Main{
        public static void main(String[] args) throws CloneNotSupportedException {
            Person person1 = new Person("Alice", 30);
            Person person2 = (Person) person1.clone();

            System.out.println(person1);
            System.out.println(person2);
        }
}