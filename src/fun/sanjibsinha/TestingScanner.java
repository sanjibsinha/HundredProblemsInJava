package fun.sanjibsinha;

import java.io.IOException;
import java.util.Scanner;

public class TestingScanner {

    //static Scanner sc = new Scanner(System.in);
    //static int num = 10;

    public static void main(String[] args) throws IOException {

        String num = "";
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        //System.out.println((int)Math.pow(2, 31));

        if(sc.hasNext()){
            num = sc.next();
            System.out.println("Your entered string is : " + num);
        } else {
            System.out.println("Enter a string first.");
        }

    }

}
