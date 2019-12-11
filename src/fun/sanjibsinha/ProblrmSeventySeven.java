package fun.sanjibsinha;
/**
 * SumOfSeriesTen 1+4+7+10.
 *
 */
public class ProblrmSeventySeven
{
    static  int sum = 0;
    static int num = 0;

    public static void main (String[] args) {

        sum = 1;
        while (num < 5)
        {
            num++;
            System.out.println(sum);
            sum += 3;
        }

    }
}
