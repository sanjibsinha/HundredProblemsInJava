package fun.sanjibsinha;

public class ProblemThirtyOne {
    public static void main(String args[]){
        //variable name of outer loop
        int anyNumber = 10;
        //we cannot define the variable twice
        //it has already been defined as int
        //the following is a continuation of outer loop, it's not inner loop
        for (anyNumber = 0; anyNumber <=5; anyNumber++){
            System.out.println(anyNumber);
        }
        System.out.println(anyNumber);
    }
}
