package ie.atu;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        add();
        delete();
        multiple();
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

    public static void multiple()
    {
        System.out.println("Please enter your first number : ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second number : ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber * secondNumber;
        System.out.println("The answer is " + total);
    }
    public static void add() {
        System.out.println("Please enter the first number");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter the second number");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("The total is " + total);

    }
}
