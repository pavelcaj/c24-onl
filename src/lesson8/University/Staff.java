package lesson8.University;

public class Staff {
    private String name;
    private String surname;


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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    private   String post;
    public Staff(String name, String surname, String post){
        this.name = name;
        this.surname = surname;
        this.post = post;
    }
}

