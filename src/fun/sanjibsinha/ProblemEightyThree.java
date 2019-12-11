package fun.sanjibsinha;

// how to create triangle patterns

class TrianglePattern{

    public void printStars(int n){
        int i, j;

        for(i=0; i < n; i++)
        {

            for(j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

public class ProblemEightyThree
{
    static int num = 0;
    public static void main(String args[])
    {
        TrianglePattern patternObject = new TrianglePattern();
        num = 5;
        patternObject.printStars(num);
    }
}