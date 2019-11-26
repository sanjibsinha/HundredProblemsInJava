package fun.sanjibsinha;

/*
there is exactly one copy of a class variable, regardless of how many times the class has been instantiated.
*/

class NewExerciseSchedule {
    static int weightGain = 5;
    static int weightLoss = 4;
    int rateOfPulse;

    public int eat(int weightGain){
        return weightGain;
    }
    public int run(int weightLoss){
        return weightLoss;
    }
}

public class ProblemTwentyEight {
    public static void main(String args[]){
        NewExerciseSchedule newScheduleOne = new NewExerciseSchedule();
        //first reference variable
        newScheduleOne.rateOfPulse = 50;
        System.out.println("Total weight loss for the first object : " + (newScheduleOne.eat(2) -
                newScheduleOne.run(2))+ ". And the rate of pulse is :  " + newScheduleOne.rateOfPulse);
        NewExerciseSchedule newScheduleTwo = new NewExerciseSchedule();
        //second reference variable
        newScheduleTwo.rateOfPulse = 60;
        System.out.println("Total weight loss for the second object : " + (newScheduleTwo.eat(3) -
                newScheduleTwo.run(1)) + ". And the rate of pulse is :  " + newScheduleTwo.rateOfPulse);
        //first reference variable points to the second object value and takes the new value
        newScheduleOne.rateOfPulse = newScheduleTwo.rateOfPulse;
        System.out.println("Total weight loss for the first object : " + (newScheduleOne.eat(10) -
                newScheduleOne.run(2))+ ". And the rate of pulse is :  " + newScheduleOne.rateOfPulse);
        //since a class variable has been declared with a static modifier
        //we can access it with a class name
        //we need not instantiate
        NewExerciseSchedule.weightLoss = 1;
        System.out.println(NewExerciseSchedule.weightGain - NewExerciseSchedule.weightLoss);
    }
}
