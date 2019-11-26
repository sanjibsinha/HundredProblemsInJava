package fun.sanjibsinha;

public class ProblemTwenty {
    //using local variable out of scope
    public void WeightOfChildBear(){
        int weight = 0;
        weight = 80;
    }

    public static void main(String[] args) {
        //it will give us errors
        //System.out.println("The weight of child bear is: " + weight);
    }
}
