package lesson7.hospital;

public class Surgeon extends Doctor{
    @Override
    public void heal(){
        System.out.println("Хирург, накладывает гипс ");
    }
}
