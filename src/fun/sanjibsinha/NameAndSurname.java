package fun.sanjibsinha;

import java.util.Scanner;
public class NameAndSurname {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String name, middle, reversed = "";
        System.out.println("Enter your first, middle, and last name ");
        name=in.nextLine();
        System.out.println("Your first, middle, and last name in upper case: " + name.toUpperCase());
        int space1=name.indexOf(" ");
        int space2=name.lastIndexOf(" ");

        middle=name.substring(space1+1,space2);

        for(int i=middle.length(); i > 0; i--)
        {
            reversed = reversed  + middle.charAt(i-1);
        }
        System.out.println("Now we can take out only the middle name: " + reversed);

    }
}
