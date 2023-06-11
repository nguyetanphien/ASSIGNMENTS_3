package util;

import model.Student;

import java.util.ArrayList;

public class SearchCourseOfAllStudent {
    public void searchAllCourse4(ArrayList<Student> arrayList) {
        System.out.printf("All student courses: ");
        for (int i = 0; i < arrayList.size(); i++)
            System.out.printf(arrayList.get(i).getCourse() + " , ");

        System.out.println("\b\b");


    }
}
