import java.util.*;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter the Number of Subjects: ");
        int x = S.nextInt(); // Number of Subjects
        int[] marks_obtained = new int[x]; // Marks array to store the marks..

        for (int i = 0; i < x; i++) {
            System.out.println("Enter Marks Obtained for Subject [" + (i + 1) + "] Out of 100: ");
            // Marks Obtained Out of 100 for Each Subject
            // Scanner Scan=new Scanner(System.in);
            marks_obtained[i] = S.nextInt();

            if (i == x - 1) {
                System.out.println("-======-----------======\nCalculating sum of total Marks...");
                System.out.println("Calculated.....");
                System.out.println("========================");
                System.out.println("Calculating Average Percentage...");
                // break;
            }
        }
        int total = 0;
        for (int i = 0; i < x; i++) {
            total = total + marks_obtained[i];
        }
        System.out.println("-======-----------======");
        System.out.println("Your, Percentage is been Calculated...");
        // System.out.println("Average - Percentage is: " + total / x);
        int average_percentage = total / x;

        if (average_percentage > 90) {
            // System.out.print("A+");
            System.out.println("-======-----------======");
            System.out.println("|     Total Marks are *  ");
            System.out.println("-======-----------======");
            System.out.println("|        " + total + "          ");
            System.out.println("-======-----------======");
            System.out.println("|    Average % of Marks:     ");
            System.out.println("|         " + average_percentage);
            System.out.println("-======-----------======");
            System.out.println("-======-----------======");
            System.out.println("| YOUR FINAL GRADE:  A+ ");
            System.out.println("-======-----------======");
            // break;
        } else if (average_percentage > 70) {
            // System.out.print("B+");
            System.out.println("-======-----------======");
            System.out.println("|     Total Marks are *  ");
            System.out.println("-======-----------======");
            System.out.println("|        " + total + "          ");
            System.out.println("-======-----------======");
            System.out.println("|    Average % of Marks:     ");
            System.out.println("|         " + average_percentage);
            System.out.println("-======-----------======");
            System.out.println("-======-----------======");
            System.out.println("| YOUR FINAL GRADE:  A ");
            System.out.println("-======-----------======");
            // break;
        } else if (average_percentage > 65) {
            // System.out.print("C");
            System.out.println("-======-----------======");
            System.out.println("|     Total Marks are *  ");
            System.out.println("-======-----------======");
            System.out.println("|        " + total + "          ");
            System.out.println("-======-----------======");
            System.out.println("|    Average % of Marks:     ");
            System.out.println("|         " + average_percentage);
            System.out.println("-======-----------======");
            System.out.println("-======-----------======");
            System.out.println("| YOUR FINAL GRADE:  B+ ");
            System.out.println("-======-----------======");
            // break;
        } else if (average_percentage > 50) {
            // System.out.print("Average");
            System.out.println("-======-----------======");
            System.out.println("|     Total Marks are *  ");
            System.out.println("-======-----------======");
            System.out.println("|        " + total + "          ");
            System.out.println("-======-----------======");
            System.out.println("|    Average % of Marks:     ");
            System.out.println("|         " + average_percentage);
            System.out.println("-======-----------======");
            System.out.println("-======-----------======");
            System.out.println("| YOUR FINAL GRADE:  Avg ");
            System.out.println("-======-----------======");
            // break;
        } else if (average_percentage > 35) {
            // System.out.print("Pass");
            System.out.println("-======-----------======");
            System.out.println("|     Total Marks are *  ");
            System.out.println("-======-----------======");
            System.out.println("|        " + total + "          ");
            System.out.println("-======-----------======");
            System.out.println("|    Average % of Marks:     ");
            System.out.println("|         " + average_percentage);
            System.out.println("-======-----------======");
            System.out.println("-======-----------======");
            System.out.println("| YOUR FINAL GRADE:  Pass");
            System.out.println("-======-----------======");
            // break;
        } else {
            // System.out.print("Fail..");
            System.out.println("-======-----------======");
            System.out.println("|     Total Marks are *  ");
            System.out.println("-======-----------======");
            System.out.println("|        " + total + "          ");
            System.out.println("-======-----------======");
            System.out.println("|    Average % of Marks:     ");
            System.out.println("|         " + average_percentage);
            System.out.println("-======-----------======");
            System.out.println("-======-----------======");
            System.out.println("| YOUR FINAL GRADE:  Fail");
            System.out.println("-======-----------======");
            // break;
        }
    }
}
