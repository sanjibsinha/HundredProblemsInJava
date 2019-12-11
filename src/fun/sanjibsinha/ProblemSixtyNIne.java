package fun.sanjibsinha;

import java.util.Scanner;

/*
accept any 5 number and print the sum of only negative numbers
*/
public class ProblemSixtyNIne {

    static int num, sum = 0;
    static int controllingNumber = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 5 number: ");
        while (controllingNumber <= 5){
            num = sc.nextInt();
            if(num < 0){
                sum += num;
            }
            controllingNumber++;
        }
        System.out.println("The sum of only negative numbers: " + sum);
    }
}
