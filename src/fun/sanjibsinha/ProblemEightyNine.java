package fun.sanjibsinha;

import java.util.Scanner;

class ReversingNumber{
    static int temp, remain;
    static int reverseNumber(int num){
        while (num > 0){
            remain = num % 10;
            temp = temp * 10 + remain;
            num /= 10;
        }
        return temp;
    }
}
public class ProblemEightyNine {
    static int num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to reverse : ");
        //taking inputs from user
        num = sc.nextInt();
        System.out.println("We are going to reverse the number :" + num + " The result is: "
                + ReversingNumber.reverseNumber(num));
    }
}
