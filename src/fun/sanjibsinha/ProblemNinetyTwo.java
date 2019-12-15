package fun.sanjibsinha;

import java.util.Scanner;

public class ProblemNinetyTwo {

    /*
    we could have declared it as static outside main() method and used inside the class
     */
    // static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your favorite number: ");

        if (sc.hasNextInt())
        {
            int numEntered = sc.nextInt();

            System.out.println("You entered " + numEntered);

            // you can do every basic mathematical operations
            int addTheNumberEntered = numEntered + numEntered;
            System.out.println("Adding together: " + addTheNumberEntered);
            numEntered += 1;
            System.out.println("1 increment: " + numEntered);
            numEntered -= 2;
            System.out.println("2 decrement: " + numEntered);

            numEntered++;
            System.out.println("One increment: " + numEntered);
            numEntered--;
            System.out.println("One decrement: " + numEntered);

        } else {
            System.out.println("Sorry you have not entered an integer");
        }
    }
}
