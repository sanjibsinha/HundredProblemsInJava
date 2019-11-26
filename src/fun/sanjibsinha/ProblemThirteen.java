package fun.sanjibsinha;

/*
One primitive value does not share its state with other primitive values
*/

class StateOfAnObject {

    byte age = 10;
    short distance = 10_000;
    int speedOfCar = 1_00_000;
    int speedOfTrain = 2_00_000;

    void printState() {
        System.out.println("The age is : " + age + ". The distance is : " + distance +
                ". The speed of car is : " + speedOfCar);
    }
}

public class ProblemThirteen {
    public static void main(String args[]) {
        StateOfAnObject state = new StateOfAnObject();
        state.speedOfCar = state.speedOfTrain;
        state.printState();
    }
}
