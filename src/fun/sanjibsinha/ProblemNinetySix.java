package fun.sanjibsinha;

/*
How Polymorphism works
 */

public class ProblemNinetySix {

    public static void main(String[] args) {
        MobileClass mob = new MobileClass();
        MobileClass aMobile = new ZenyClass();
        mob.name = "Mob";
        aMobile.name = "A Mobile";

        if(aMobile.equals(mob)){
            System.out.println(mob.name + " is equal to " + aMobile.name);
        } else {
            System.out.println(mob.name + " is not equal to " + aMobile.name);
        }

        System.out.println();
        MobileClass anotherMobile
                = new ZenyClass("Another Zeny", "Blue", 65.00, 5);
        System.out.println(anotherMobile.name + " has color: " + anotherMobile.getColor());
        System.out.println(anotherMobile.name + "'s price: " + anotherMobile.getPrice() + " Euro.");
        /*
        System.out.println(anotherMobile.name + " takes charge of : "
                + anotherMobile.takeCharge(6.23) + " minutes.");

                Error:(14, 32) java: cannot find symbol
  symbol:   method takeCharge(double)
  location: variable anotherMobile of type fun.sanjibsinha.MobileClass

         */

        System.out.println("The ZenyModified mobile object has unique identifier: "
                + anotherMobile.hashCode());
    }
}
