package lesson8.University;

public class Student {
    private String name;
    private String surname;
    private String number_Group;
    private String link_To_Dormitory;
    private int link_To_Room;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }



    public int getLink_To_Room() {
        return link_To_Room;
    }



    public String getLink_To_Dormitory() {
        return link_To_Dormitory;
    }

    public void setLink_To_Dormitory(String link_To_Dormitory) {
        this.link_To_Dormitory = link_To_Dormitory;
    }

    public void setLink_To_Room(int link_To_Room) {
        this.link_To_Room = link_To_Room;
    }

    public String getNumber_Group() {
        return number_Group;
    }

    public void setNumber_Group(String number_Group) {
        this.number_Group = number_Group;
    }



    public Student(String name, String surname, String number_Group){
        this.surname = surname;
        this.name = name;
        this.number_Group = number_Group;
    }
    public Student(String name, String surname, String number_Group, String link_To_Dormitory, int link_To_Room){
        this.surname = surname;
        this.name = name;
        this.number_Group = number_Group;
        this.link_To_Dormitory = link_To_Dormitory;
        this.link_To_Room = link_To_Room;
    }
}

