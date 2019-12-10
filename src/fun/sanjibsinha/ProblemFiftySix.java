package fun.sanjibsinha;

public class ProblemFiftySix {

    public static void main(String[] args) {
        // unary operators may be postfix and prefix
        //but there is a difference
        int x = 10;
        //postfix
        x++;
        //x = 11
        System.out.println(x);
        ++x;
        //x = 12
        System.out.println(x);
        x--;
        //x = 11
        System.out.println(x);
        --x;
        //x = 10
        System.out.println(x);
        int a = 0;
        a = x;
        //a = 10
        System.out.println(a);
        a = x++;
        //a = 10, not 11, postfix version (x++) evaluates to the original value, ie; 10
        // although value of x changes to 11
        System.out.println(a);
        // a gets the incremented value if we make a = x
        a = x;
        // a is 11
        System.out.println(a);
        a = ++x;
        //a = 12, prefix version (++x) evaluates to the incremented value
        System.out.println(a);

    }
}
