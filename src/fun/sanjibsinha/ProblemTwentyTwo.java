package fun.sanjibsinha;

import java.io.*;

    //these are instance variables
    //you need not initialize them like local variables
class StudentClasses {
    int className;
    //we could have added more states and methods to change the states
    }

public class ProblemTwentyTwo {
    public static void main(String args[]) {
        //here john is the reference variable
        //it'll act as a handle to the new object
        //john is stored in stack, and the new object is stored in heap
        StudentClasses john = new StudentClasses();
        //now john can access the instance variable
        john.className = 1;
        System.out.println("The new student john studies at class : " + john.className);
        StudentClasses mary = new StudentClasses();
        mary.className = 2;
        System.out.println("The new student mary studies at class : " + mary.className);
        john.className = mary.className;
        System.out.println("After one year john passed the exam and now he studies at : " + john.className);
    }
}
