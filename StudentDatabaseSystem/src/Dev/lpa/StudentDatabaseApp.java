package Dev.lpa;

import java.util.Objects;
import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {

        // Ask how many students we want to add
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Please enter the number of students to enroll: ");

            if (scanner.hasNextInt()) {
                numberOfStudents = scanner.nextInt();
                validInput = true;  // Input is valid, exit the loop
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();  // Clear the invalid input
            }
        }
        Student [] students = new Student[numberOfStudents];

        // Create n number of new students
        for (int  n= 0; n < numberOfStudents; n++) {
            students[n] = new Student();
            students[n].enrollInCourse();
            students[n].viewBalance();
            students[n].payTuition();

//            System.out.println("------".repeat(1000));
//            System.out.println(students[n].showINFO());
        }

        for(int n = 0; n < numberOfStudents; n++){
            System.out.println("------".repeat(1000));
            System.out.println(students[n].showINFO());
        }

    }
}
