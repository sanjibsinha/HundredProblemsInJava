package fun.sanjibsinha;

class CheckingDivision{

    public int num;

    public void restrictDivisionByZero(int num){
        try{
            this.num = num;
            System.out.println(num/0);

        }
        catch (ArithmeticException e){

            //your custom message
            System.out.println("You can't divide by 0");
            //java's error message
            System.out.println(e.getMessage());
            //the exception name and error message
            System.out.println(e.toString());
            //you can also print the standard error stack trace
            e.printStackTrace();

        }
    }

}

public class ProblemNinetyNine {

    public static void main(String[] args) {
        CheckingDivision checkDivision = new CheckingDivision();
        checkDivision.restrictDivisionByZero(10);
    }

}
