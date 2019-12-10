package fun.sanjibsinha;

public class ProblemFiftyFive {

    public static void main(String[] args) {
        //assignment operator is evaluated right to left
        //the declaration of data type allocates memory
        //variable x stores the value 10
        int x = 10;
        int y = 20;
        //arithmetic operators -> +, -, *. /, %
        int result = x + y;
        System.out.println(result);
        result = result - x;
        System.out.println(result);
        result = x * y;
        System.out.println(result);
        result = y / x;
        System.out.println(result);
        y = y - 1;
        //now y = 19
        result = y % x;
        //the remainder is 9
        System.out.println(result);

        //arithmetic operator can concatenate the strings
        String firstName = "John";
        String lastName = "Rambo";
        System.out.println(firstName + " " + lastName);

        //unary operators require only one operand
        int a = +12;
        //a is positive
        System.out.println(a);
        a = -a;
        //a is negative
        System.out.println(a);
        a--;
        //-12 -1 = -13
        System.out.println(a);
        a++;
        //-13 + 1 = -12
        System.out.println(a);
    }
}
