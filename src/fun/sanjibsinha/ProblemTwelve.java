package fun.sanjibsinha;

/*
primitive data types and default values
 */

import org.w3c.dom.CDATASection;

class PrimitiveDataTypes {
    byte age = 10;
    // byte distance = 144; // exceeding range
    short height = 30000; // inside range
    // short elevation = 40000; // outside range
    int distanceBetweenTwoSatellites = 1000000000; // inside range
    // int distanceBetweenTwoGalaxy = 10000000000; // outside range
    long distanceBetweenTwoGalaxy = 10000000000L; // inside range
    float rateOfInterest = 6/5f; // range is beyond the scope of discussion
    double rateOfHike = 456/123d; // range is beyond the scope of discussion
    char capitalA = 'A';
    boolean isPossible = true;

    void printState() {
        System.out.println("Age :" + age + ". Height: " + height + ". Distance Between Two Galaxies "
        + distanceBetweenTwoGalaxy + ". Distance Between Two Satellites " + distanceBetweenTwoSatellites +
                ". Rate of Interest: " + rateOfInterest + ". Rate of Hike :" + rateOfHike +
                ". Capital A :" + capitalA + ". Is it possible? :" + isPossible);
    }
}

public class ProblemTwelve {
    public static void main(String args[]) {
        PrimitiveDataTypes dataObject = new PrimitiveDataTypes();
        dataObject.printState();
    }
}
