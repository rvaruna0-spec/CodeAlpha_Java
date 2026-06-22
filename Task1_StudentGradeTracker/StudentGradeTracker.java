import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> grades = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {

            System.out.print("Enter grade of student " + (i + 1) + ": ");
            grades.add(sc.nextInt());
        }

        int highest = grades.get(0);
        int lowest = grades.get(0);
        int sum = 0;

        for(int grade : grades) {

            sum += grade;

            if(grade > highest)
                highest = grade;

            if(grade < lowest)
                lowest = grade;
        }

        double average = (double) sum / grades.size();

        System.out.println("\n----- STUDENT REPORT -----");
        System.out.println("Average Score : " + average);
        System.out.println("Highest Score : " + highest);
        System.out.println("Lowest Score  : " + lowest);

        sc.close();
    }
}