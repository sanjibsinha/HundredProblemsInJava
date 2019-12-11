package fun.sanjibsinha;

//find the sum of first ten Fibonacci numbers
class SumOfFirstFibonacciNumbers{

    //we need a method that will return the sum
    public int findTheSum(int n){
        if (n <= 0)
            return 0;

        int fibo[]=new int[n+1];
        fibo[0] = 0; fibo[1] = 1;

        int sum = fibo[0] + fibo[1];

        for (int i=2; i<=n; i++)
        {
            fibo[i] = fibo[i-1]+fibo[i-2];
            sum += fibo[i];
        }

        return sum;
    }

}

public class ProblemEightyOne {

    static int num = 0;

    public static void main(String args[])
    {
        num = 10;
        SumOfFirstFibonacciNumbers fiboObject = new SumOfFirstFibonacciNumbers();
        System.out.println("Sum of first ten Fibonacci numbers is : " + fiboObject.findTheSum(num));
    }
}
