package ie.atu;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        multiple();
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
}
