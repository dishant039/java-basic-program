import java.sql.SQLOutput;
import java.util.Scanner;

public class CWH_05takinginput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner dc = new Scanner(System.in);
        System.out.println("Enter number1");
        int a = dc.nextInt();
        System.out.println("Enter number2");
        int b = dc.nextInt();
        int sum = a + b;
        System.out.println("The sum of these numbers:");
        System.out.println(sum);
    }

    }
