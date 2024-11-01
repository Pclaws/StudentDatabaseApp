package Dev.lpa;

import java.util.Scanner;

public class Student {
    private String firstname;
    private String lastname;
    private int gradeYear;
    private String StudentID;
    private String courses = "";
    private double tuitionBalance = 0;
    private static double costOfCourses = 600;
    private static int id = 1000;

    // Constructor : prompt user to enter student's name and year

    public Student() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstname = input.nextLine();

        System.out.println("Enter student last name: ");
        this.lastname = input.nextLine();

        System.out.println("1- freshman\n2- sophmore\n3- junior\n4- senior\nEnter student class level: ");
        this.gradeYear = input.nextInt();
//        System.out.println("firstName " + " " + lastname + " " + gradeYear);

        setStudentID();

    }


    // Generate an ID

    public void setStudentID() {
        id++;
        StudentID = gradeYear +""+ id;
    }


    // Enroll in courses

    public void enrollInCourse() {
        //get inside a loop, user hits 0

        do {
            System.out.print("Enter course to enroll(Q to quit ):");
            Scanner input = new Scanner(System.in);
            String course = input.nextLine().trim();
            if(!course.equalsIgnoreCase("Q")){
                if(!course.isEmpty()){
                    if(!courses.isEmpty()){
                        courses += "\n";
                    }

                    courses = courses + "\n " + course;
                    tuitionBalance += costOfCourses;
                }

                else{
                    System.out.println("No course entered. Please enter a valid course.");
                }
            }

            else{
                break;
            }

        } while (true);



//        System.out.println("ENROLLED IN " + courses);


        System.out.println("Tuition balance: " + tuitionBalance);
    }

    // view balance
    public void viewBalance(){
        System.out.println("Tuition balance is : $" + tuitionBalance);
    }

    // pay tuition
    public void payTuition(){

        System.out.print("Enter your payment $:");
        Scanner input = new Scanner(System.in);
        double payedAmount = input.nextDouble();
        tuitionBalance -= payedAmount;
        System.out.println("Thank you for your payment of $" + payedAmount);
        viewBalance();
    }

    // Show status
    public String showINFO(){
        System.out.println("------".repeat(1000));
        return "Name: " + firstname + " " + lastname +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + StudentID +
                "\nCourse enrolled:" + courses +
                "\nTuition balance: $" + tuitionBalance;
    }
}
