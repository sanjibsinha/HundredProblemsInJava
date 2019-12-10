package fun.sanjibsinha;

/*
A simple introduction to bitwise operator
binary of 10 is 1010,
binary of 11 is 1011
*/

public class ProblemSixtyOne {

    public static void main(String[] args) {
        int x = 10; // 1010
        int y = 11; // 1011
        // for AND (&) operator if both bits are 1, it gives 1, else it gives 0
        System.out.println((x & y)); // 1010, that is 10
        // for OR (|) operator if either of the bits is 1, it gives 1, else it gives 0
        System.out.println((x | y)); // 1011, that is 11
        // for XOR (^) operator if corresponding bits are different, it gives 1, else it gives 0
        System.out.println((x ^ y)); // 0001, that is 1
        // for Complement (~) operator with all bits inversed, means it makes every 0 to 1, and every 1 to 0
        System.out.println(~x); // 0101, that is 5, 2's complement of 5 is -11
    }
}
