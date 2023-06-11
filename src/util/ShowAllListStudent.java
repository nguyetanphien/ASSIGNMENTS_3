package util;

import model.Student;

import java.util.ArrayList;

public class ShowAllListStudent {


    public void outputStudent(Student student) {
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getCourse());
        System.out.println("Coure: " + student.getCourse());
        System.out.println("Address: " + student.getAddress());
        System.out.println("medium: " + student.getMediumScore());
    }
    public void outputListStudent(ArrayList<Student> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Student: " + (i + 1));
            outputStudent(arrayList.get(i));
        }
    }

}
