import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        String input1 = scanner.nextLine();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        String input2 = scanner.nextLine();

        // Try parsing the inputs as integers
        try {
            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);

            // Compare the two numbers
            if (num1 == num2) {
                System.out.println("The numbers are equal.");
            } else if (num1 < num2) {
                System.out.println("The first number is less than the second number.");
            } else {
                System.out.println("The second number is less than the first number.");
            }
        } catch (NumberFormatException e) {
            // Handle the case where inputs are not valid numbers
            System.out.println("Invalid input. Please enter valid numbers.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
