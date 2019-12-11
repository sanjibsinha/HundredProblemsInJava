package fun.sanjibsinha;

import java.util.Scanner;

/*
Enter a number to check whether odd or even
enter 0 to terminate the program
 */
public class ProblemSeventyOne {
    static int num = 1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether odd or even\n" +
                "and enter 0 to terminate the program");
        while (num != 0){
            num = sc.nextInt();
            if(num == 0){
                break;
            }
            if(num % 2 == 0){
                System.out.println(num + " is an even number");
            } else {
                System.out.println(num + " is an odd number");
            }
        }
    }
}
