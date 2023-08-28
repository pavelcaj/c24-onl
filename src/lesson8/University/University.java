package lesson8.University;

import java.util.ArrayList;

public class University {


    private ArrayList<Student> students;
    private ArrayList<Staff> staff;
    private ArrayList<Dormitory> dormitories;

    public ArrayList<Staff> getStaff() {
        return staff;
    }

    public void setStaff(ArrayList<Staff> staff) {
        this.staff = staff;
    }

    public ArrayList<Dormitory> getDormitories() {
        return dormitories;
    }

    public void setDormitories(ArrayList<Dormitory> dormitories) {
        this.dormitories = dormitories;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }


    public void addStudent(Student student) {
        students.add(student);
    }
    public void addStaff(Staff staff) {
        this.staff.add(staff);
    }

}