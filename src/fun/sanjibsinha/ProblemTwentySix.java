package fun.sanjibsinha;

/*
method level scope of a local variable
*/

class ChildPanda {
    public void eat() {
        int weight = 3;
        System.out.println("After each meal child panda gains weight : " + weight);
    }
}

public class ProblemTwentySix {
    public static void main(String args[]) {
        ChildPanda child = new ChildPanda();
        //we cannot access the variable weight
        //since it is declared inside method, it has a method level scope
        //weight cannot be accessed out the method
        //the following line will give us error
        //child.weight = 4;
        child.eat();
    }
}
