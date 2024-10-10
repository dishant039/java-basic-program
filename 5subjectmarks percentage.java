import java.util.Scanner;

public class CWHrevision {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        float percentage;
        System.out.println(" ENTER YOUR  MARKS ONE BY ONE ");
        System.out.println("first subject marks");
        int subject1 = marks.nextInt();
        System.out.println("second subject marks");
        int subject2 = marks.nextInt();
        System.out.println("third subject marks");
        int subject3 = marks.nextInt();
        System.out.println("fourth subject marks");
        int subject4 = marks.nextInt();
        System.out.println(" fifth subject marks");
        int subject5 = marks.nextInt();
        int sum= subject1+subject2+subject3+subject4+subject5;
        System.out.println("total marks from it");
        System.out.println(sum);
percentage = ( sum/500.0f)* 100;
        System.out.println("the percentage is :");
        System.out.println(percentage);


    }
}
