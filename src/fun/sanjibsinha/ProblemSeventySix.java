package fun.sanjibsinha;
//

// Java program to find
// the frequency of a
// digit in a number
public class ProblemSeventySix
{
    // function to find frequency
    // of digit in a number
    static int frequencyDigits(int n, int d)
    {
        // Counter variable to
        // store the frequency
        int c = 0;

        // iterate till number
        // reduces to zero
        while (n > 0)
        {
            // check for equality
            if (n % 10 == d)
                c++;
            // reduce the number
            n = n / 10;
        }
        return c;
    }

    // Driver Code
    public static void main(String[] args)
    {

        // input number
        int myNumber = 1122322;

        // input digit
        int findTheDigit = 2;

        System.out.println("Frequency of digit 2 in the number " + myNumber + " is : " + frequencyDigits(myNumber, findTheDigit));
    }
}
