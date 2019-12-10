package fun.sanjibsinha;
/*
Equality, and Relational Operators
==      equal to
!=      not equal to
>       greater than
>=      greater than or equal to
<       less than
<=      less than or equal to
*/

public class ProblemFiftySeven {

    public static void main(String[] args) {
        //it tests whether one operand is greater than, less than, equal to, or not equal to another operand
        int x = 10;
        int y = 20;
        if (x == y){
            System.out.println("x == y");
        }
        //it is true, we will get the output
        if (x != y){
            System.out.println("x != y");
        }
        if (x > y){
            System.out.println("x > y");
        }
        if (x >= y){
            System.out.println("x >= y");
        }
        //it is true, we will get the output
        if (x < y){
            System.out.println("x < y");
        }
        //it is true, we will get the output
        if (x <= y){
            System.out.println("x <= y");
        }
    }
}
