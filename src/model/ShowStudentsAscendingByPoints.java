package model;

import java.util.ArrayList;

public class ShowStudentsAscendingByPoints extends Student {
    public void showAllStudents3(ArrayList<Student> arrayList) {
        ShowAllListStudent showAllListStudent = new ShowAllListStudent();
        Student temp;
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).getMediumScore() > arrayList.get(j).getMediumScore()) {
                    temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, temp);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Student :" + (i + 1));
            showAllListStudent.outputStudent2(arrayList.get(i));
        }
    }
}
