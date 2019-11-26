package fun.sanjibsinha;


class StudentClassesAndNames {
    public static int className;
    public static String studentName;
}


public class ProblemTwentyThree {
    public static void main(String args[]) {
        StudentClassesAndNames.studentName = "John";
        StudentClassesAndNames.className = 1;
        System.out.println(StudentClassesAndNames.studentName + " studies at class " + StudentClassesAndNames.className);
    }
}
