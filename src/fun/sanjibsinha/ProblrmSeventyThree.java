package fun.sanjibsinha;
/*
check special number
 */
import java.util.*;

public class ProblrmSeventyThree {

    public static void main(String[] args) {

        System.out.println("Enter any number : ");
        Scanner scan = new Scanner(System.in);
        int inputNumber = scan.nextInt();
        boolean result = specialnumber(inputNumber);
        if (result == true)
            System.out.println(inputNumber + " is a Special number");
        if (result == false)
            System.out.println(inputNumber + " is NOT a Special number");
    }

    public static boolean specialnumber(int inputNumber) {

        // Create a copy of the inputNumber

        int temp = inputNumber;

        // Initialize sumOfDigits of inputNumber
        int sumOfDigits = 0;

        /* Calculate the sum of factorial of

           digits */

        while (temp != 0) {

            // Get the rightmost digit

            int currentDigit = temp % 10;
            sumOfDigits = sumOfDigits + factorial(currentDigit);
            temp = temp/10;
        }

        /* If sumOfDigits is equal to inputNumber then
        the number is Special, otherwise not */

        return (sumOfDigits == inputNumber);
    }

    public static int factorial(int number) {
        if (number == 1 || number == 0)
            return 1;
        else
            return (number * factorial(number -1));
    }
}

