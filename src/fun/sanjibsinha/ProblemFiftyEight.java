package fun.sanjibsinha;

/*
 Conditional Operators perform Conditional-AND and Conditional-OR operations on two boolean expressions
 && -> AND
 || -> OR
*/
/*
The Golden rules:
true && false -> false
false && true -> false
true && true -> true
false && false -> false
-----------------------
true || false -> true
false || true -> true
true || true -> true
false || false -> false
 */

public class ProblemFiftyEight {

    public static void main(String[] args) {

        int x = 10;
        int y = 100;
        if (true){
            //this block will work
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        if (false){
            //this block will not work
            System.out.println("true");
        }
        else{
            //it comes to this block
            System.out.println("false");
        }
        System.out.println("**********");
        if (true && false){
            //this block will not work
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        System.out.println("**********");
        if (false && true){
            //this block will not work
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        System.out.println("**********");
        if (true && true){
            //this block will work
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        System.out.println("**********");
        if (false && false){
            //this block will not work
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        if (true || false){
            //this block will work
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        System.out.println("**********");
        if (false || true){
            //this block will work
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        System.out.println("**********");
        if (true || true){
            //this block will work
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        System.out.println("**********");
        if (false || false){
            //this block will not work
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
