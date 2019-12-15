package fun.sanjibsinha;

public class ProblemNinetyFive {

    public static void main(String[] args) {
        ZenyClass zenyOne = new ZenyClass();
        zenyOne.name = "New Zeny";
        zenyOne.setHeight(7.12);
        System.out.println(zenyOne.name + " has height of " + zenyOne.getHeight() + " inches.");
        System.out.println("The New Zeny mobile object has unique identifier: " + zenyOne.hashCode());
        System.out.println(zenyOne.name + " represents the " + zenyOne.getClass());
        System.out.println();
        ZenyClass zenyTwo = new ZenyClass("ZenyModified", "Blue", 55.00, 10);
        System.out.println(zenyTwo.name + " has color: " + zenyTwo.getColor());
        System.out.println(zenyTwo.name + "'s price: " + zenyTwo.getPrice() + " Euro.");
        System.out.println(zenyTwo.name + " takes charge of : "
                + zenyTwo.takeCharge(6.23) + " minutes.");
        System.out.println(zenyTwo.name + " has battery lasting power of "
                + (int)zenyTwo.batteryCanLast(3) + " days.");
        System.out.println("The ZenyModified mobile object has unique identifier: "
                + zenyTwo.hashCode());
        System.out.println(zenyTwo.name + " represents the " + zenyTwo.getClass());

        if(zenyOne.equals(zenyTwo)){
            System.out.println(zenyOne.name + " is equal to " + zenyTwo.name);
        } else {
            System.out.println(zenyOne.name + " is not equal to " + zenyTwo.name);
        }

    }
}
