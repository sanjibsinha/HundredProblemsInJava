package fun.sanjibsinha;
/*
How to declare a variable to refer to an array
*/

public class ProblemThirtyFour {

    public static void main(String[] args){
        //to declare an array of integer, a primitive data type
        int[] studentClasses = new int[2];
        //to declare an array of String, a non-primitive data type
        String[] studentNames = new String[4];
        //the brackets after the data type indicate it's an array
        //an array has two parts : data type and name
        //the data type also indicates what type of elements the array will contain
        //the next line will give an error of incompatible type
        /*
        studentNames[0] = 12;
        */
        studentNames[0] = "John"; //this is OK with the compiler
        System.out.println("The name of the student who has come out first : " + studentNames[0]);
    }
}
