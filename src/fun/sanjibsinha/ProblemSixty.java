package fun.sanjibsinha;

/*
Changing decimal value to binary
 */

class DecimalToBinary{

    public Integer Decimal2Binary(Integer myDecimalNumber) {

        if (myDecimalNumber == 0) {
            return myDecimalNumber;
        }

        StringBuilder myBinaryNumber = new StringBuilder();
        Integer quotient = myDecimalNumber;

        //we keep dividing the quotient until the quotient becomes 0
        while (quotient > 0) {
            int remainder = quotient % 2;
            myBinaryNumber.append(remainder);
            quotient /= 2;
        }

        myBinaryNumber = myBinaryNumber.reverse();
        return Integer.valueOf(myBinaryNumber.toString());
    }
}

public class ProblemSixty {

    public static void main(String[] args) {

        DecimalToBinary myNumber = new DecimalToBinary();
        System.out.println(myNumber.Decimal2Binary(5));
    }
}
