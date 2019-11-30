package fun.sanjibsinha;

/*
System class has a method called 'arraycopy()' that has five parameters
arraycopy(Object source, int source-position, Object destination, int destination position, int length)
*/

public class ProblemForty {

    public static void main(String[] args){

        String[] notAMeaningfulSentence = {"My ", "I ", "am ", "not ", "a ", "Robot"};
        String[] aMeaningfulSentence = new String[5];
        System.arraycopy(notAMeaningfulSentence, 1, aMeaningfulSentence, 0, 5);
        for (int i = 0; i<=4; i++){
            System.out.print(aMeaningfulSentence[i]);
        }
    }
}
