package lesson13.hw3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
 * оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
 * Написать метод, который удаляет студентов со средним баллом <3. Если средний
 * балл>=3, студент переводится на следующий курс. Дополнительно написать метод
 * printStudents(List<Student> students, int course), который получает список студентов и
 * номер курса. А также печатает на консоль имена тех студентов из списка, которые
 * обучаются на данном курсе.
 */
public class StudentManagement {
    private List<Student> students;

    public StudentManagement() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }


    public void removeStudentsWithLowAverage() {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            double averageGrade = student.calculateAverageGrade();
            if (averageGrade < 3.0) {
                iterator.remove();
            } else {

                int currentCourse = student.getCourse();
                student.setCourse(currentCourse + 1);
            }
        }
    }

    public void printStudentsByCourse(int course) {

        for (Student student : students) {
            System.out.println("Имя студента: " + student.getName());
            System.out.println("Курс студента: " + student.getCourse());
            System.out.println("Средний балл студента: " + student.calculateAverageGrade());
            System.out.println();
        }
    }

    public void printAllStudents() {

        for (Student student : students) {
            System.out.println("Имя студента: " + student.getName());
            System.out.println("Курс студента: " + student.getCourse());
            System.out.println("Средний балл студента: " + student.calculateAverageGrade());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();

        List<Double> grades1 = new ArrayList<>();
        grades1.add(4.5);
        grades1.add(3.7);
        Student student1 = new Student("Иван", "Группа А", 1, grades1);

        List<Double> grades3 = new ArrayList<>();
        grades3.add(1.5);
        grades3.add(2.7);
        Student student3 = new Student("Изя", "Группа А", 1, grades3);

        List<Double> grades2 = new ArrayList<>();
        grades2.add(2.8);
        grades2.add(3.2);
        Student student2 = new Student("Мария", "Группа Б", 2, grades2);

        studentManagement.addStudent(student1);
        studentManagement.addStudent(student2);
        studentManagement.addStudent(student3);

        studentManagement.printStudentsByCourse(1);

        System.out.println("Удаление студентов со средним баллом < 3...");
        studentManagement.removeStudentsWithLowAverage();

        System.out.println("Остались следующие студенты:");

        studentManagement.printAllStudents();
    }
}

