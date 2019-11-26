package fun.sanjibsinha;

/*
there is exactly one copy of a class variable, regardless of how many times the class has been instantiated.
*/

class ExerciseSchedule {
    static int weightGain = 0;
    static int weightLoss = 0;
    public void eat(int weightGain){
        ExerciseSchedule exerciseOne = new ExerciseSchedule();
        this.weightGain = 2;
        System.out.println("After each meal the weight gain is : " + exerciseOne.weightGain);
    }
    public void run(int weightLoss){
        ExerciseSchedule exerciseTwo = new ExerciseSchedule();
        this.weightLoss = 2;
        System.out.println("After running two miles the weight gain is: " +
                ( exerciseTwo.weightGain - exerciseTwo.weightLoss ));
    }

}

public class ProblemTwentySeven {
    public static void main(String args[]){
        ExerciseSchedule newScheduleOne = new ExerciseSchedule();
        newScheduleOne.eat(2);
        newScheduleOne.run(2);
        ExerciseSchedule newScheduleTwo = new ExerciseSchedule();
        newScheduleTwo.eat(3);
        newScheduleTwo.run(3);
    }
}
