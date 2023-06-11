package util;

import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchAndShowId {
    public void searchID5(ArrayList<Student> arrayList) {

        ShowAllListStudent showAllListStudent = new ShowAllListStudent();
        Scanner scanner = new Scanner(System.in);
        String id2;
        System.out.printf("Enter search id: ");
        id2 = scanner.nextLine();
        for (int i = 0; i < arrayList.size(); i++)
            if (arrayList.get(i).getId().equalsIgnoreCase(id2))
                showAllListStudent.outputStudent(arrayList.get(i));
    }
}
