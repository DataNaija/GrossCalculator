// code to calculate an employee's gross pay
package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args){
        // System.out.println("Hello world");

        // Get the numbers of hours worked
        int hours = 0;
        System.out.println("How many hours did you work?:");

        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

        // Get the hourly pay rate
        double payRate = 0;
        System.out.println("What is your pay rate?:");
        payRate = scanner.nextDouble();

        scanner.close();

        // Multiply hours and pay rate
        double grossPay = hours * payRate;

        // Display the result

        System.out.println("Gross pay: " +grossPay);

    }
}
