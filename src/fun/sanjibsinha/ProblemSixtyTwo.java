package fun.sanjibsinha;

class HumanBehaviour{
    boolean isTrustWorthy = false;
    int dependenceCounter = 0;
}

public class ProblemSixtyTwo {

    public static void main(String[] args) {

        HumanBehaviour john = new HumanBehaviour();
        john.isTrustWorthy = true;
        if(john.isTrustWorthy == true){
            //only if the above condition is true, this block will work
            john.dependenceCounter++;
            System.out.println("We could depend on John because the dependence counter is positive : "
                    + john.dependenceCounter);
        } else {
            john.dependenceCounter--;
            System.out.println("We could not depend on John because the dependence counter is positive : "
                    + john.dependenceCounter);
        }
        HumanBehaviour hobgoblin = new HumanBehaviour();
        if(hobgoblin.isTrustWorthy == true){
            //only if the above condition is true, this block will work
            System.out.println("We could depend on Hobgoblin because the dependence counter is positive : "
                    + hobgoblin.dependenceCounter);
        } else {
            //since the above condition is not true, this block will work
            hobgoblin.dependenceCounter--;
            System.out.println("We could not depend on Hobgoblin because the dependence counter is positive : "
                    + hobgoblin.dependenceCounter);
        }
    }
}
