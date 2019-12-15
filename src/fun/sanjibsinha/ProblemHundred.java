package fun.sanjibsinha;

import java.util.LinkedList;

public class ProblemHundred {

    public static void main(String[] args) {
        //creating a linked list that contains strings
        LinkedList<String> cart = new LinkedList<String>();
        cart.add("Book");
        cart.add("Grocery");
        cart.add("Garments");
        cart.add("Mobile");
        /*
        for(String item : cart){
            System.out.print(item + ", ");
        }

        it will print
        Book, Grocery, Garments, Mobile,
         */
        //adding last element
        cart.addLast("TV");
        //adding first element
        cart.addFirst("Bottle");
        /*
        for(String item : cart){
            System.out.print(item + ", ");
        }

        it will now print: Bottle, Book, Grocery, Garments, Mobile, TV,
         */
        cart.add(0, "Refrigerator");
        cart.set(3, "Medicine");
        /*
        for(String item : cart){
            System.out.print(item + ", ");
        }

        printing: Refrigerator, Bottle, Book, Medicine, Garments, Mobile, TV,
        in the new list Grocery is replaced by Medicine
         */
        //we can create a copy or back-up of the above collection
        LinkedList<String> backUp = new LinkedList<String>(cart);
        /*
        System.out.println(backUp);
        it gives us exact copy of the cart
        [Refrigerator, Bottle, Book, Medicine, Garments, Mobile, TV]
         */
        /*
        System.out.println(cart.indexOf("Book"));
        System.out.println(cart.get(2));
        printing:
        2
        Book
         */
        //we can remove items either using index or value
        /*
        cart.remove(0);
        cart.remove("Refrigerator");
        cart.removeFirst();
        cart.removeLast();

         */
        //wec can check whether the cart and the copy contains the same

        if(cart.containsAll(backUp)){
            System.out.println("It is same.");
        } else {
            System.out.println("Not same.");
        }
        //let us remove the last value from the copy
        backUp.removeLast();
        System.out.println(backUp);
        //the last value TV is deleted
        //it does not affect the original linked list
        System.out.println(cart);
        backUp.push("TV");
        System.out.println(backUp);
        //now the backup has been rearranged
        // [TV, Refrigerator, Bottle, Book, Medicine, Garments, Mobile]

    }

}
