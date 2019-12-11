package fun.sanjibsinha;

public class ProblemSixtyFive {

    public static void main(String[] args) {
        System.out.println("Continue statement: ");
        //continue statement tells the control to skip the current statement
        //the loop executes the remaining statement
        for(int i = 0; i < 5; i++){
            if(i == 2){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Break statement: ");
        for(int i = 0; i < 5; i++){
            if(i == 2){
                break;
                //loop terminates when this condition is true
            }
            System.out.println(i);
        }
    }
}
