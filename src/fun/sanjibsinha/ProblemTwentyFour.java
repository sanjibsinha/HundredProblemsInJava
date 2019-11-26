package fun.sanjibsinha;

/*
Member variables can be declared inside class, but outside any method
There are four types of access modifiers
1) public = it is available in package, subclass, and outer world
2) protected = it is available in package, subclass, and not in the outer world
3) private = it is not available in package, subclass, and outer world
4) default (no modifier) = it is only available in package
*/

/*
In this program we will check them individually
*/

class FatherPanda {
    public boolean isPredator;
    protected int weight;
    private int age;
    public void eat() {
        System.out.println("After each meal Father Panda gains weight : " + weight + ". And his age is : " + age);
    }
}

public class ProblemTwentyFour {
    public static void main(String args[]) {
        FatherPanda father = new FatherPanda();
        System.out.println("Is father panda predator ? " + father.isPredator);
        father.weight = 5;
        //it will give error
        //we cannot modify private member variable this way
        //father.age = 10;
        father.eat();
    }
}
