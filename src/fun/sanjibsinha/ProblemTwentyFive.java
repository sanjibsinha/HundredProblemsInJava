package fun.sanjibsinha;

/*
Understanding member variables and access modifier
*/

class MotherPanda {
    public boolean isPredator;
    protected int weight;
    private int age;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println("After each meal Mother Panda gains weight : " + getWeight() + ". And her age is : " + getAge());
    }
}

public class ProblemTwentyFive {
    public static void main(String args[]) {
        MotherPanda mother = new MotherPanda();
        mother.setWeight(2);
        mother.setAge(7);
        mother.eat();
        FatherPanda father = new FatherPanda();
        //protected member variable available in package
        father.weight = 200;
        //public member variable available in package
        System.out.println("Is father panda predator? " + father.isPredator);
        //public method available in everywhere
        father.eat();
    }
}
