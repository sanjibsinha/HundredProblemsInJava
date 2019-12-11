package fun.sanjibsinha;

/*
unfixed iterations, where number of iterations is unknown
a set of statements is repeated till a given condition is true
two types: entry controlled and exit controlled
 */

public class ProblemSixtySeven {

    public static void main(String[] args) {
        //entry controlled
        int i = 0;
        while (i <= 5){
            i++;
            System.out.println(i);
        }
        System.out.println("**********");
        for(i = 0; i <=5; i++){
            System.out.println(i);
        }

    }
}
