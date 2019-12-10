package fun.sanjibsinha;

/*
You can use the instanceof operator to test if an object is an instance of a class,
an instance of a subclass, or an instance of a class that implements a particular interface
*/

interface PlaceTheOrder{
    public void place();
}
class ParentClass implements PlaceTheOrder{

    public void place(){
        System.out.println("Placing the order.");
    }

}
class ChildClass extends ParentClass{

}
public class ProblemFiftyNine {

    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        ChildClass child = new ChildClass();

        /*
        The following two questions will have answers true
        */
        System.out.println("Is parent isntance of ParentClass? : " + (parent instanceof ParentClass));
        System.out.println("Is parent isntance of interface PlaceTheOrder? : " + (parent instanceof PlaceTheOrder));
        //it is false
        System.out.println("Is parent isntance of ChildClass? : " + (parent instanceof ChildClass));
        /*
        The floowing answers will be true, because ChidlClass is a subclass of ParentClass
        */
        System.out.println("Is child isntance of ChildClass? : " + (child instanceof ChildClass));
        System.out.println("Is child isntance of ParentClass? : " + (child instanceof ParentClass));
        System.out.println("Is child isntance of interface PlaceTheOrder? : " + (child instanceof PlaceTheOrder));

    }
}
