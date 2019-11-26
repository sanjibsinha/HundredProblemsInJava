package fun.sanjibsinha;

class ReferenceVariable {
    int num;
}

public class ProblemEighteen {
    public static void main(String[] args) {
        int i = 10;
        int j = 5;
        System.out.println(i + " " + j);
        i = j;
        System.out.println(i + " " + j);
        j++;
        System.out.println(i + " " + j);

        ReferenceVariable numOne = new ReferenceVariable();
        ReferenceVariable numTwo = new ReferenceVariable();
        numOne = numTwo;
        numOne.num = 10;
        System.out.println(numOne.num + " " + numTwo.num);
        numTwo.num++;
        System.out.println(numOne.num + " " + numTwo.num);
    }
}
