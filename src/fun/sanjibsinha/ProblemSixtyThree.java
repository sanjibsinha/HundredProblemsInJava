package fun.sanjibsinha;

/*
Based on ranges of values or conditions, if-the-else can test expressions.
A switch statement tests expressions based only on a single integer, enumerated value, or String object
*/

class Human{
    int age;
    String name;
    public void display(int displayAge, String displayName){
        this.age = displayAge;
        this.name = displayName;
        System.out.println("Age of the person : " + displayAge + ". Name of the person : " + displayName);
    }
}

public class ProblemSixtyThree {

    public static void main(String[] args){

        Human personOne = new Human();
        Human personTwo = new Human();
        Human personThree = new Human();


        Human[] persons = new Human[2];
        persons[0] = personOne;
        Human[] personCollection = {personOne, personTwo, personThree};
        for (int i = 0; i < 3; i++){
            switch (i){
                case(0):
                    personCollection[i].display(10, "Sanjib");
                    break;
                case(1):
                    personCollection[i].display(20, "John");
                    break;
                case(2):
                    personCollection[i].display(30, "Robert");
                    break;
            }
        }
    }
}
