import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // constructor: prompt user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student's first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student's last name: ");
        this.lastName = in.nextLine();


        System.out.println("1 - Freshman;\n2 - Sophmore;\n3 - Junior;\n4 - Senior.\nEnter student's class level: ");
        this.gradeYear = in.nextInt();
        setStudentId();
        // System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);


    }

    //generate id
    private void setStudentId() {
        id++;
        this.studentId = gradeYear + " " + id;
    }


    // enroll in courses
    public void enrol() {
        //get inside a loop, user hits Q to hit
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                // System.out.println("BREAK");
                break;
            }
        } while (1 != 0);
        // System.out.println("Enrolled in " + courses);
        //  System.out.println("Tuition balance is " + tuitionBalance);

    }


    //view balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    //pay tuition
    public void payTuition() {
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in2 = new Scanner(System.in);
        int payment = in2.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    //show status
    public String showInfo() {
        return "Name: " + firstName + " "+lastName +
                "\nGrade level " + gradeYear +
                "\nStudent id " + studentId+
                "\nCourses enrolled " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}


