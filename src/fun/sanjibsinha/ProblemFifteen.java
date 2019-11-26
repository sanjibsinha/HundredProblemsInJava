package fun.sanjibsinha;

/*
One primitive value does not share its state with other primitive values
*/

class StatesOfAnObject {

    byte age = 10;
    byte length = 100;
    int speedOfCar = 1_00_000;

    void printState() {
        System.out.println("The age is : " + age + ". The distance is : " + length +
                ". The speed of car is : " + speedOfCar);
    }
}

public class ProblemFifteen {
    public static void main(String[] args){
        StatesOfAnObject state = new StatesOfAnObject();
        state.speedOfCar = state.age + state.length;
        state.printState();
    }
}
