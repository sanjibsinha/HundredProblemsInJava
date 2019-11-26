package fun.sanjibsinha;

/*
One primitive value does not share its state with other primitive values
*/

class SharingStatesOfAnObject {

    byte age = 10;
    int speedOfCar = 1;

    void printState() {
        System.out.println("The age is : " + age +
                ". The speed of car is : " + speedOfCar);
    }
}

public class ProblemFourteen {
    public static void main(String args[]) {
        SharingStatesOfAnObject state = new SharingStatesOfAnObject();
        //state.speedOfCar = state.age;
        //state.age = state.speedOfCar;
        state.printState();
    }
}
