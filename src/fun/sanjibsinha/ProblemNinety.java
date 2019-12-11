package fun.sanjibsinha;

import java.util.Scanner;

class FindPrime{

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
}

public class ProblemNinety {
    static int num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to find it is prime or not : ");
        //taking inputs from user
        num = sc.nextInt();
        if(FindPrime.isPrime(num)){
            System.out.println("You have entered : " + num + ". It is prime.");
        } else {
            System.out.println("You have entered : " + num + ". It is not prime.");
        }
    }
}
