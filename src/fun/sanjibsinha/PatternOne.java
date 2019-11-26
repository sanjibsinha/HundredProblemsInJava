package fun.sanjibsinha;

public class PatternOne {
    public static void main(String args[])
    {
        int a,b;
        System.out.println("The pattern:");
        for(a=1;a<=5;a++)
        {
            for(b=1;b<=a;b++)
                System.out.println(b+" ");
            System.out.println();
        }
    }
}
