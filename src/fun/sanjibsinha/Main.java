package fun.sanjibsinha;

import java.util.*;
import java.util.Scanner;
import java.lang.String;

class MyObject{};
class MyMemory{

    void myMethod(MyObject myParam) {
        String str = myParam.toString();
        System.out.println(str);
    }
};

public class Main {
    public static void main(String[] args) {
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        s = in.nextLine();
        System.out.println("You entered string " + s);
        MyObject myObj = new MyObject();
        MyMemory myMem = new MyMemory();
        myMem.myMethod(myObj);
    }
}