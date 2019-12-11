package fun.sanjibsinha;
/*
only odd numbers between 1 to 9, using continue
 */

public class ProblemSeventyTwo {

    public static void main(String[] args) {
        int controllingNumber = 0;

        while (controllingNumber <= 9){
            controllingNumber += 1;
            if(controllingNumber % 2 == 0){
                continue;
            }
            System.out.println("The only odd numbers: " + controllingNumber);

        }
    }
}
