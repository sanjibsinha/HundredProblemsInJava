package fun.sanjibsinha;

/*
rules and conventions for naming fields in a class;
the terms variables and fields are both used
 */

class RobotOne {

    int speed = 0;

    void walk(int $distance, int _hour) {
        speed = $distance/_hour;
    }
    void run(int $distance, int _hour) {
        speed = $distance/_hour;
    }
    void printState() {
        if(speed <= 5) {
            System.out.println("The speed of robot is " + speed + ". It walks.");
        }
        else {
            System.out.println("The speed of robot is " + speed + " kilometers per hour. It runs.");
        }

    }
}

public class ProblemEleven {
    public static void main(String args[]) {
        RobotOne robot1 = new RobotOne();
        robot1.walk(10, 2);
        robot1.printState();
    }
}
