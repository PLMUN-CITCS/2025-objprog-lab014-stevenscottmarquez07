// File: MethodReturnTypes.java
public class MethodReturnTypes {
    
    // Main method
    public static void main(String[] args) {
        // Call displayWelcomeMessage to show a welcome message
        displayWelcomeMessage();
        
        // Declare two integers
        int value1 = 20;
        int value2 = 30;
        
        // Call calculateAverage to calculate the average of value1 and value2
        double result = calculateAverage(value1, value2);
        
        // Print the result
        System.out.println("The average is: " + result);
    }

    // Void method that displays a welcome message
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to our program!");
    }
    
    // Value-returning method that calculates the average of two numbers
    public static double calculateAverage(int num1, int num2) {
        double average = (num1 + num2) / 2.0;
        return average; // Returning the calculated average
    }
}
