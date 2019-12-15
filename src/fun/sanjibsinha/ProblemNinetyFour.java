package fun.sanjibsinha;

public class ProblemNinetyFour {

    public static void main(String[] args) {
        ZenyClass zenyOne = new ZenyClass();
        zenyOne.name = "My Zeny";
        zenyOne.setHeight(6.12);
        System.out.println(zenyOne.name + " has height of " + zenyOne.getHeight() + " inches.");
        System.out.println();
        ZenyClass zenyTwo = new ZenyClass("Zeny", "Red", 45.00, 20);
        System.out.println(zenyTwo.name + " has color: " + zenyTwo.getColor());
        System.out.println(zenyTwo.name + "'s price: " + zenyTwo.getPrice() + " Euro.");
        System.out.println(zenyTwo.name + " takes charge of : "
                + zenyTwo.takeCharge(12.23) + " minutes.");
        System.out.println(zenyTwo.name + " has battery lasting power of "
                + (int)zenyTwo.batteryCanLast(2) + " days.");

    }
}
