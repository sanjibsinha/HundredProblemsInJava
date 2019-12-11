package fun.sanjibsinha;
// find Armstrong numbers based on user's input

import java.util.Scanner;

public class ProblemEightyFour
{
    public static void main(String[] args) {
        int num, lastDigit, digits, sum, i;
        int start, end;

        Scanner sc = new Scanner(System.in);

        /*
        Taking inputs of lower and upper limit from user
        */
        System.out.println("Enter lower limit: ");
        start = sc.nextInt();
        System.out.println("Enter upper limit: ");
        end = sc.nextInt();

        System.out.println("Armstrong number between " + start + " and " + end + " are : ");

        for(i=start; i<=end; i++)
        {
            sum = 0;

            /* Copying the value of num for processing */
            num = i;

            /* Finding total digits in num */
            digits = (int) java.lang.StrictMath.log10(num) + 1;

            /* Calculating the sum of power of digits */
            while(num > 0)
            {
                /* Extracting the last digit */
                lastDigit = num % 10;

                // Finding sum of power of digits
                sum = sum + (int)java.lang.StrictMath.pow(lastDigit, digits);

                /* Removing the last digit */
                num = num / 10;
            }

            /* Finally checking for Armstrong number */
            if(i == sum)
            {
                System.out.println(i);
            }
        }
    }
}
