package fun.sanjibsinha;

public class ProblemNinetySeven {

    public static void main(String[] args) {
        CatyClass catyOne = new CatyClass();
        catyOne.name = "New Caty";
        catyOne.setHeight(8.12);
        System.out.println(catyOne.name + " has height of " + catyOne.getHeight() + " inches.");
        System.out.println("The New Zeny mobile object has unique identifier: " + catyOne.hashCode());
        System.out.println(catyOne.name + " represents the " + catyOne.getClass());
        System.out.println();
        catyOne.version = 2.0;
        System.out.println(catyOne.name + " has version " + catyOne.version);
        catyOne.setVersion(3.0);
        System.out.println(catyOne.name + " is upgraded to " + catyOne.getVersion());
    }
}
