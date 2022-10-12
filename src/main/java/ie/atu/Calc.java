package ie.atu;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        delete();
    }

    public static void delete()
    {
        System.out.println("Please enter your first number:");
        Scanner inputs = new Scanner(System.in);
        int firstnumber = inputs.nextInt();

        System.out.println("Please enter your second number:");
        int secondnumber = inputs.nextInt();

        int total = firstnumber - secondnumber;
        System.out.println("The total is: " + total);
    }
}
