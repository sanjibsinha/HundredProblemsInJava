package fun.sanjibsinha;

import java.util.Scanner;

public class ArmStrongNumbers {
    public static void main(String[] args) {
        int num, lastDigit, digits, sum, i;
        int start, end;

        Scanner sc = new Scanner(System.in);

        /* Input lower and upper limit from user */
        System.out.println("Enter lower limit: ");
        start = sc.nextInt();
        System.out.println("Enter upper limit: ");
        end = sc.nextInt();

        System.out.println("Armstrong number between " + start + " and " + end + " are : ");

        for(i=start; i<=end; i++)
        {
            sum = 0;

            /* Copy the value of num for processing */
            num = i;

            /* Find total digits in num */
            digits = (int) java.lang.StrictMath.log10(num) + 1;

            /* Calculate sum of power of digits */
            while(num > 0)
            {
                /* Extract the last digit */
                lastDigit = num % 10;

                // Find sum of power of digits
                // Use ceil() function to overcome any rounding errors by pow()
                sum = sum + (int)java.lang.StrictMath.pow(lastDigit, digits);

                /* Remove the last digit */
                num = num / 10;
            }

            /* Check for Armstrong number */
            if(i == sum)
            {
                System.out.println(i);
            }
        }
    }


}
