package fun.sanjibsinha;
/*
Introduction to array object
Primitive data types are not objects created from a class. They are special data types built into the language.
To build an array object we need to take help from primitive data types.
The only exception is String
What features will distinguish array from primitive data types?
Let us see to that problem

class APrimitiveDataTypeClass{
    int myNumber = 65;
}
class AnArrayClass{
    private int[] myArray;

    public void setMyArray(int[] myArray) {
        this.myArray = myArray;
    }

    public int[] getMyArray() {
        return myArray;
    }
}
*/

public class ProblemThirtyThree {

    public static void main(String[] args){
        //an example of primitive data type
        //a variable is a container that contains a value or a primitive data types
        int myAge = 54;
        System.out.println("An example of primitive data type : " + myAge);
        //in case of array we declare it with a new keyword
        //the following array container holds a fixed number of value of fixed primitive data type int
        //the length of the array is established
        //here the length is 2, this container has 2 elements
        int[] myBasket = new int[2];
        //each item or element has a corresponding numerical index that starts with 0
        myBasket[0] = 2;
        myBasket[1] = 3;
        //each element can be accessed by its corresponding numerical index
        System.out.println("The first element of my basket : " + myBasket[0]);
        System.out.println("The second element of my basket : " + myBasket[1]);
    }

}
