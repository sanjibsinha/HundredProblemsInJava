package fun.sanjibsinha;

/*
rules and conventions for naming fields in a class;
the terms variables and fields are both used
 */

class Robot {

    int speed = 0;

    void walk(int distance, int hour) {
        speed = distance/hour;
    }
    void run (int distance, int hour) {
        speed = distance/hour;
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

public class ProblemTen {
    public static void main(String args[]) {
        Robot robot1 = new Robot();
        robot1.walk(40, 2);
        robot1.printState();
    }
}
