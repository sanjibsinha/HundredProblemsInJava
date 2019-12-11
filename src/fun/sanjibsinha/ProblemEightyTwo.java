package fun.sanjibsinha;

//check whether a number is Duck Number or not.

import java.util.Scanner;

class DuckNumber{

    public int checkingDuck(String num){

        int len = num.length();
        int countZero = 0 ;
        char myChar;

        for(int i = 1; i < len; i++)
        {
            myChar = num.charAt(i);
            if(myChar == '0')
                countZero++;
        }
        return countZero ;
    }
}

public class ProblemEightyTwo
{
    static int num = 0;
    static String str;
    static char digitAtIndexZero;

    public static void main(String[] args){
        DuckNumber myDuck = new DuckNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether the number is a Duck number or not: ");
        num = sc.nextInt();
        String num1 = Integer.toString(num);
        str = Integer.toString(num);
        digitAtIndexZero = str.charAt(0);
        if( myDuck.checkingDuck(str) > 0 && digitAtIndexZero != '0')
            System.out.println("It is a duck number");
        else
            System.out.println("It is not a duck number");
    }
}

