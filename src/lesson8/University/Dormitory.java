package lesson8.University;

public class Dormitory extends University{
    private Boolean[] room;

    public Dormitory(String name, String surname, Boolean[] room){
        super();
        this.room = room;
    }


    public Boolean[] getRoom() {
        return room;
    }

    public void setRoom(Boolean[] room) {
        this.room = room;
    }
}

