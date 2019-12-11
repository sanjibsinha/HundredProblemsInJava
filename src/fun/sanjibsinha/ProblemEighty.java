package fun.sanjibsinha;
/**
 * input 4 numbers and more to get Sum of Even And Odd
 */
import java.util.*;
public class ProblemEighty
{
    static int num=1, sumOfEven=0, sumOOdd=0;
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        while(num !=0){
            System.out.println("Enter zero to end");
            num = in.nextInt();

            if(num!=0){
                if(num>0 && num%2==0)
                    sumOfEven = sumOfEven + num;
                if(num>0 && num%2!=0)
                    sumOOdd = sumOOdd + num;
            }

            if(num==0)
                break;
        }

        System.out.println("The sum of positive even numbers  = " + sumOfEven);
        System.out.println("The sum of positive odd numbers  = " + sumOOdd);
    }
}
