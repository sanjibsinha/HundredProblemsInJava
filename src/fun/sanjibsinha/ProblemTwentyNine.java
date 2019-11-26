package fun.sanjibsinha;

public class ProblemTwentyNine {
    private int mySecretNumber = 10;
    public void displaySecret(){
        mySecretNumber = 45;
        ProblemTwentyNine secret = new ProblemTwentyNine();
        System.out.println("Reference variable : " + secret.mySecretNumber);
        System.out.println("Local Variable : " + mySecretNumber);
        secret.mySecretNumber = mySecretNumber;
        System.out.println("Reference variable points to the local variable : " + secret.mySecretNumber);
    }
    public static void main(String args[]){
        ProblemTwentyNine notSoPrivate = new ProblemTwentyNine();
        notSoPrivate.displaySecret();
    }
}
