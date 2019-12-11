package fun.sanjibsinha;
/*
finding the PalPrime number
 */
import java.util.*;

public class ProblemEightySix {

    static int num, temp, last, sum = 0, origin = 0;

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        //taking inputs from user
        num = sc.nextInt();
        //storing the user input in a temporary variable
        temp = num;
        for(int i = 1; i <= temp; i++)
        {
            if(temp % i == 0)
            {
                origin++;
            }
        }
        while(num > 0)
        {
            //extracting the last digit
            last = num % 10;
            //storing it
            sum = (sum * 10) + last;
            //extract all digits except the last
            num = num / 10;
        }
        //comparing with the original number
        if(temp == sum && origin == 2)
        {
            System.out.println("Number is PalPrime : " + temp);
        }
        else
        {
            System.out.println("Number is not PalPrime : " + temp);
        }
    }
}
