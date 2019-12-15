package fun.sanjibsinha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputOne {

    static String name;
    static int age;

    public static void main(String[] args) throws IOException {

        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name ");
        name = str.readLine();
        System.out.println("Your name : " + name);
        int i = 0;
        for(i = 0; i <= name.length(); i++){
            System.out.println(i);
        }
        System.out.println();
        int j = 0;
        while (j <= name.length()){
            j++;
            System.out.println(j);
        }
    }
}
