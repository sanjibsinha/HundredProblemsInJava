package fun.sanjibsinha;

import java.util.Scanner;

public class ProblemNinetyThree {

    static String name = "sanjib";

    public static void main(String[] args) {

        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            String yourName = sc.next();
            if(yourName.equals(name)){
                System.out.println("Your name is: " + yourName);
                int i = 0;
                while (i <= yourName.length()){
                    i++;
                }
                System.out.print("There are " + (i -1) + " characters in your name.");
            } else {
                System.out.println("You have not entered proper name.");
            }
        } else {
            System.out.println("Next time ...");
        }

    }
}
