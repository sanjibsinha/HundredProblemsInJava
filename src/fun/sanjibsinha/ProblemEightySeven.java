package fun.sanjibsinha;

import java.util.Scanner;

class TwistedPrime{

    static int temp, remain;

    static int reverseNumber(int num){
        while (num > 0){
            remain = num % 10;
            temp = temp * 10 + remain;
            num /= 10;
        }
        return temp;
    }
    static boolean isPrime(int num){
        if (num <= 1)
            return false;
        if (num <= 3)
            return true;

        if (num % 2 == 0 || num % 3 == 0)
            return false;

        for (int i = 5; i * i <= num; i = i + 6)
            if (num % i == 0 || num % (i + 2) == 0)
                return false;

        return true;
    }

    static boolean isTwistedPrime(int num){
        if (isPrime(num) == false)
            return false;

        return isPrime(reverseNumber(num));
    }

}

public class ProblemEightySeven {

    static int num = 0;

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check whether that is twisted prime number or not: ");
        num = in.nextInt();
        if(TwistedPrime.isTwistedPrime(num)){
            System.out.println("The number " + num + " is a twisted prime number.");
        }
        else{
            System.out.println("The number " + num + " is not a twisted prime number.");
        }
    }
}
