package lesson8.University;

public class Dormitory{
    private int[][] room;
    private String name;
    private String adress;

    public int[][] getRoom() {
        return room;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setRoom(int[][] room) {
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dormitory(String name, String adress, int[][] room){
        this.name = name;
        this.adress = adress;
        this.room = room;
    }

}

