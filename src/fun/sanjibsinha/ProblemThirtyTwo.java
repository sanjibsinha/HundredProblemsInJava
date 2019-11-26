package fun.sanjibsinha;

public class ProblemThirtyTwo {
    public static void main(String args[]){
        //variable name of outer loop
        int anyNumber = 10;
        //we cannot define the variable twice
        //it has already been defined as int
        //the following is not a continuation of outer loop, it's an inner loop
        //hence the variable name is changed
        for (int myNumber = 0; myNumber <=5; myNumber++){
            System.out.println("Output of inner loop : " + myNumber);
        }
        System.out.println("Output of outer loop : " + anyNumber);
    }
}
