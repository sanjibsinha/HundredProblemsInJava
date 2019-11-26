package fun.sanjibsinha;

/*
Covering objects and classes
*/

class Car {

    int speed = 0;
    int gear = 1;

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void speedDown(int decrement) {
        speed = speed - decrement;
    }

    void stateOfCar() {
        System.out.println(" The speed of car: " + speed + " when gear is :" + gear);
    }
}

public class ProblemEight {
    public static void main(String args[]){
        //creating two car objects
        Car car1 = new Car();
        Car car2 = new Car();
        car1.changeGear(2);
        car1.speedUp(10);
        car1.stateOfCar();
        car1.changeGear(3);
        car1.speedUp(30);
        car1.stateOfCar();
        car1.changeGear(1);
        car1.speedDown(35);
        car1.stateOfCar();
    }
}
