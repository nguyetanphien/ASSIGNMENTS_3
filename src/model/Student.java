package model;

import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private int age;
    private String course;
    private String address;
    private float mediumScore;

    public Student() {
    }

    public Student(String id, String name, int age, String course, String address, float mediumScore) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.address = address;
        this.mediumScore = mediumScore;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(float mediumScore) {
        this.mediumScore = mediumScore;
    }

    public Student input() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter ID: ");
        id = scanner.nextLine();
        System.out.printf("Enter Name: ");
        name = scanner.nextLine();
        System.out.printf("Enter age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Enter coure: ");
        course = scanner.nextLine();
        System.out.printf("Enter address: ");
        address = scanner.nextLine();
        System.out.printf("Enter medium score: ");
        mediumScore = scanner.nextFloat();

        return new Student(id, name, age, course, address, mediumScore);
    }

}
