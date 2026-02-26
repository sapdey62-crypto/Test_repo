import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int number;
        int reversedNumber = 0;

        // Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        number = scanner.nextInt();
        scanner.close(); // Close the scanner to release resources

        int originalNumber = number; // Store the original number for the output

        // Reverse the number using a while loop
        while (number != 0) {
            int remainder = number % 10;          // Extract the last digit
            reversedNumber = reversedNumber * 10 + remainder; // Build the reversed number
            number = number / 10;                 // Remove the last digit from the original number
        }

        // Display the result
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);
    }
}
