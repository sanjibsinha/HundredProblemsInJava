package fun.sanjibsinha;

/*
unfixed iterations, exit controlled
 */

public class ProblemSixtyEight {

    public static void main(String[] args) {
        //local variable
        int i = 0;
        do {
            //statements are executed before checking the condition
            //exit controlled
            i++;
            System.out.println(i);
        } while (i <= 5);
        //the decision is made at the exit point
    }
}
