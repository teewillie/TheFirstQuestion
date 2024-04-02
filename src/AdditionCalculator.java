

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdditionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple Addition Calculator!");
        System.out.print("Please enter the first number: ");
        int num1 = getInput(scanner);

        System.out.print("Great! Now, please enter the second number: ");
        int num2 = getInput(scanner);

        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        System.out.println("Thank you for using the calculator!");

        scanner.close();
    }

    public static int getInput(Scanner scanner) {
        int input;
        while (true) {
            try {
                input = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Oops! That's not a valid number. Please enter a valid integer.");
                System.out.print("Try again: ");
                scanner.next(); // clear the invalid input from scanner
            }
        }
        return input;
    }
}
