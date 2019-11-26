package fun.sanjibsinha;

/*
Local variables must be initialized
 */

public class ProblemTwentyOne {

    //local variable
    public void WeightOfMotherBear(){
        int weight = 10;
        System.out.println("The weight of mother bear is: " + weight);
    }

    public static void main(String[] args) {
        ProblemTwentyOne motherBear = new ProblemTwentyOne();
        //you cannot initialize local variable here
        //it will give us errors
        //motherBear.weight = 150;
        motherBear.WeightOfMotherBear();
    }

}
