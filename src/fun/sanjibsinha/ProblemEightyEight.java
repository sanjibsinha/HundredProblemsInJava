package fun.sanjibsinha;

import java.util.Scanner;

public class ProblemEightyEight {

    static int len;
    static String str, strUpper;

    public static void main(String[] args){
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a string");
            str = in.nextLine();
            System.out.println("You entered string " + str);
            strUpper = str.toUpperCase();
            System.out.println("Your entered-string changes to upper case " + strUpper);
            len = strUpper.length();
            for(int i = 0; i < len - 1; i++){

                for(int j = 0; j < i; j++){
                    System.out.print(strUpper.charAt(j));
                }
                System.out.println(strUpper.charAt(i));
            }
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }
}
