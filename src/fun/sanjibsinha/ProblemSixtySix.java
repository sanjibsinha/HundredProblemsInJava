package fun.sanjibsinha;

import java.util.Scanner;

/*
display the sum of two positive numbers for 4 iterations
if the sum is negative, the loop ends
 */
public class ProblemSixtySix {
    //we need three variables globally
    static int numOne;
    static int numtwo;
    static int sumOfTwoNumbers;

    public static void main(String[] args) {
        // we will take input from the users
        Scanner firstInput = new Scanner(System.in);
        Scanner secondInput = new Scanner(System.in);

        for(int i = 0; i < 4; i++){
            System.out.println("Enter the first positive integer: ");
            numOne = firstInput.nextInt();
            System.out.println("Enter the second positive integer: ");
            numtwo = secondInput.nextInt();
            sumOfTwoNumbers = numOne + numtwo;
            System.out.println("The sum of two numbers: " + sumOfTwoNumbers);
            if(sumOfTwoNumbers > 0){
                continue;
            } else {
                System.out.println("The sum is negative. The program terminates");
                break;
            }
        }
    }
}
