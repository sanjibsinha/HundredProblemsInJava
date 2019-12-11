package fun.sanjibsinha;

import java.util.*;

public class ProblemEightyFive {

    static int num, sum;

    public static void main(String[] args){
        System.out.println("We are going to get a sum of series like 2 -4 + 6 - 8 +...upto n:");
        System.out.println("Enter the value of n here: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        for(int i = 2; i <= num; i = i + 2){
            if(i % 4 == 0){
                sum = sum - i;
            } else{
                sum = sum + i;
            }
        }
        System.out.println("Sum of series upto " + num + " terms is : " + sum);
    }
}
