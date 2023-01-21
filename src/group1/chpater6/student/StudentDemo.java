package group1.chpater6.student;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name Please");
        String name = scanner.nextLine();
        System.out.println("Input surname Please");
        String surname = scanner.nextLine();
        System.out.println("Input age please ");
        int age = scanner.nextInt();
        Student student = new  Student(name, surname, age);
        System.out.println("Student IS Registered");
    }
}
