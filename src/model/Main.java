package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<Student> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        while (true) {
            int tt;
            do {
                System.out.println("Enter 1. Input student\n" +
                        "2. Show all list student . \n" +
                        "3. Displays the average score of the gradual list of students \n" +
                        "4. Search course of all student \n" +
                        "5. Search and show id of a student \n" +
                        "6. Exit");
                tt = scanner.nextInt();
            } while (tt < 1 || tt > 7);

            switch (tt) {
                case 1:
                    Student student = new Student();
                    arrayList.add(student.input());
                    break;
                case 2:
                    ShowAllListStudent showAllListStudent1 = new ShowAllListStudent();
                    showAllListStudent1.outputStudent(arrayList);
                    break;
                case 3:
                    ShowStudentsAscendingByPoints ascendingByPoints = new ShowStudentsAscendingByPoints();
                    ascendingByPoints.showAllStudents3(arrayList);
                    break;
                case 4:
                    SearchCourseOfAllStudent courseOfAllStudent = new SearchCourseOfAllStudent();
                    courseOfAllStudent.searchAllCourse4(arrayList);
                    break;
                case 5:
                    SearchAndShowId searchAndShowId = new SearchAndShowId();
                    searchAndShowId.searchID5(arrayList);
                    break;
                default:
                    System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        Main staticMain = new Main();
        staticMain.menu();
    }
}
