import model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    Student student1[];

    Scanner scanner = new Scanner(System.in);
    int n;

    public void input(Student student) {
        scanner.nextLine();
        System.out.printf("Nhap ID: ");
        student.setId(scanner.nextLine());
        System.out.printf("Nhap Name: ");
        student.setName(scanner.nextLine());
        System.out.printf("Nhap age: ");
        student.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.printf("Nhap coure: ");
        student.setCourse(scanner.nextLine());
        System.out.printf("Nhap address: ");
        student.setAddress(scanner.nextLine());
        System.out.printf("Nhap medium score: ");
        student.setMediumScore(scanner.nextFloat());

    }

    public void cau1() {
        System.out.printf("Nhap so sinh vien: ");
        n = scanner.nextInt();
        student1 = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu " + (i + 1));
            student1[i] = new Student();
            input(student1[i]);
        }
    }

    public void output(Student student) {

        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getCourse());
        System.out.println("Coure: " + student.getCourse());
        System.out.println("Address: " + student.getAddress());
        System.out.println("medium: " + student.getMediumScore());

    }

    public void cau2() {
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh Vien thu " + (i + 1));
            output(student1[i]);
        }
    }

    public void cau3() {
        Student temp;
        for (int i = 0; i < student1.length - 1; i++) {
            for (int j = i + 1; j < student1.length; j++) {
                if (student1[i].getMediumScore() > student1[j].getMediumScore()) {
                    temp = student1[i];
                    student1[i] = student1[j];
                    student1[j] = temp;
                }
            }
        }
        cau2();
    }

    public void cau4() {
        System.out.printf("Tat ca khoa hoc cua hoc vien: ");
        for (int i = 0; i < student1.length; i++) {
            System.out.printf(student1[i].getCourse() + ",");
        }
        System.out.println("\b");
    }

    public void cau5() {
        String id2;
        System.out.printf("Nhap id tim kiem: ");
        scanner.nextLine();
        id2 = scanner.nextLine();
        for (int i = 0; i < student1.length; i++) {
            if (student1[i].getId().equalsIgnoreCase(id2))
                output(student1[i]);
        }
    }

    public void main() {
        while(true){
            int tt;
            do{
                System.out.println("Enter 1. Input student\n" +
                        "2. Show all list student . \n" +
                        "3. Displays the average score of the gradual list of students \n" +
                        "4. Search course of all student \n" +
                        "5. Search and show id of a student \n" +
                        "6. Exit");
                tt = scanner.nextInt();
            }while (tt<1||tt>7);

            switch (tt) {
                case 1:
                    cau1();
                    break;
                case 2:
                    cau2();
                    break;
                case 3:
                    cau3();
                    break;
                case 4:
                    cau4();
                    break;
                case 5:
                    cau5();
                    break;

                default:
                    System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.main();

    }
}