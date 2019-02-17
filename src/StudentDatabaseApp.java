import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        //ask how many new users we want to add

        System.out.println("Enter number of students you want to add:");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] student = new Student[numOfStudents];

        //create number of new students
        for (int i = 0; i < numOfStudents; i++) {
            student[i] = new Student();
            student[i].enrol();
            student[i].payTuition();
            System.out.println(student[i].showInfo());
        }
    }

    }

