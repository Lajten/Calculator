package ohrman.max;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // create object of scanner class
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // print the available options
        printOptions();


        // run the software as long as running = true
        while (running) {

            // take the user input as input and clear the scanner for new input
            int input = scanner.nextInt();
            scanner.nextLine();

            // match stored input to case
            switch (input) {
                //terminate program by stopping the while loop
                case 0:
                    System.out.println("Shutting down...");
                    running = false;
                    break;
                //Run operation
                case 1:
                    performOperation();
                    break;
                //Print options
                case 2:
                    printOptions();
                    break;
                // invalid input by user prompt for proper value
                default:
                    System.out.println("Please enter a valid number (2 for options)");
            }

        }
    }

    private static void performOperation() {
        // create object of scanner class
        Scanner scanner = new Scanner(System.in);

        // prompt for operator to be used
        System.out.println("Please enter the operator you wish to use. (+,-,*,/)");
        char operator = scanner.next().charAt(0);

        // prompt for the first number
        System.out.println("Please enter the first number");
        double firstNumber = scanner.nextDouble();

        // prompt for the second number
        System.out.println("Please enter the second number");
        double secondNumber = scanner.nextDouble();

        switch (operator) {
            // perform addition of numbers
            case '+':
                System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                break;
            // perform subtraction of numbers
            case '-':
                System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                break;
            // perform multiplication of numbers
            case '*':
                System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                break;
            // perform division of numbers
            case '/':
                System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                break;
            // invalid operation defaults to this message
            default:
                System.out.println(operator + " is not a valid operator.");
        }
        // adding space after last printed line and print the menu options before exiting performOperation()
        System.out.println();
        printOptions();
    }

    // print the available options
    private static void printOptions() {
        System.out.println("0 - Terminate software");
        System.out.println("1 - Run operation");
        System.out.println("2 - print options");
    }

}
