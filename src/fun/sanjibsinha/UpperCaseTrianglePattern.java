package fun.sanjibsinha;

import java.io.*;
import java.util.Scanner;
import java.lang.String;
public class UpperCaseTrianglePattern {

    public static void main(String[] args){
        try {
            //int a;
            //float b;
            String s;
            int l;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a string");
            s = in.nextLine();
            System.out.println("You entered string " + s);
            String sUpper = s.toUpperCase();
            System.out.println("Your entered-string changes to upper case " + sUpper);
            l = sUpper.length();
            for(int i=0; i<l - 1;i++)
            {

                for(int j=0;j<i;j++)
                {
                    System.out.printf("%c ",sUpper.charAt(j));
                }
                System.out.printf("%c\n",sUpper.charAt(i));
            }
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }

}

/*
        System.out.println("Enter an integer");
        a = in.nextInt();
        System.out.println("You entered integer "+a);
        System.out.println("Enter a float");
        b = in.nextFloat();
        System.out.println("You entered float "+b);
        */

/*
    import java.io.*;
    class Demo {
    	public static void main(String args[]) throws IOException {
    		String s;
    		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
     		System.out.println("Enter a string");
     		s = ob.readLine();
    		System.out.println("You entered String "+s);
     	}
    }

        class Demo {
    	public static void main(String args[]){
    		String s = args[0];
    		System.out.println("You entered String "+s);
     	}
    }
 */