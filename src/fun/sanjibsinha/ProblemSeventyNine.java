package fun.sanjibsinha;
/*
find the sum of prime divisors of n
 */

import java.util.Scanner;

public class ProblemSeventyNine
{
    static int myNUmber = 0;
    //checking whether the number is prime or not
    static boolean isPrime(int num)
    {
        if (num <= 1)
            return false;
        if (num <= 3)
            return true;

        if (num % 2 == 0 || num % 3 == 0)
            return false;

        for (int i = 5;
             i * i <= num; i = i + 6)
            if (num % i == 0 ||
                    num % (i + 2) == 0)
                return false;
        return true;
    }


    static int SumOfPrimeDivisors(int num)
    {
        int sum = 0;
        for (int i = 1;
             i <= num; i++)
        {
            if (num % i == 0)
            {
                if (isPrime(i))
                    sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number: ");
        myNUmber = in.nextInt();
        System.out.print("Sum of prime divisors of " + myNUmber + " is " +
                SumOfPrimeDivisors(myNUmber) + "\n");
    }
}
