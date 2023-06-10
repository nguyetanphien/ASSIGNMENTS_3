package model;

import java.util.ArrayList;

public class ShowAllListStudent {
    Student student = new Student();

    public void outputStudent2(Student student) {
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getCourse());
        System.out.println("Coure: " + student.getCourse());
        System.out.println("Address: " + student.getAddress());
        System.out.println("medium: " + student.getMediumScore());
    }
    public void outputStudent(ArrayList<Student> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Student: " + (i + 1));
            outputStudent2(arrayList.get(i));
        }
    }

}
