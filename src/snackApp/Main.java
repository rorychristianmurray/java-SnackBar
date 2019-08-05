package snackApp;

public class Main {

    public static void main(String[] args) {
        // Instantiate two customers
        Customer custy1 = new Customer("Jane", 45.25);
        Customer custy2;
        custy2 = new Customer("Bob", 33.14);

        // Instantiate three vending machines

        VendingMachine vendy1 = new VendingMachine("Food");
        VendingMachine vendy2;
        vendy2 = new VendingMachine("Drink");
        VendingMachine vendy3 = new VendingMachine("Office");

        // Instantiate five snacks

        Snack snack1 = new Snack("Chips", 36, 1.75, vendy1.getId());
        Snack snack2 = new Snack("Chocolate Bar", 36, 1.00, vendy1.getId());
        Snack snack3 = new Snack("Pretzel", 30, 2.00, vendy1.getId());
        Snack snack4 = new Snack("Soda", 24, 2.50, vendy2.getId());
        Snack snack5 = new Snack("Water", 20, 2.75, vendy2.getId());

        // Customer 1 buys 3 of snack 4
        custy1.makePurchase(3, snack4);

        // Print Customer 1 cash on hand
        System.out.println(custy1.getCash());

        // Print quantity of snack 4
        System.out.println(snack4.getQuantity());

        // Customer 1 buys 1 of snack 3
        custy1.makePurchase(1, snack3);

        // Print Customer 1 cash on hand
        System.out.println(custy1.getCash());

        // Print quantity of snack 3
        System.out.println(snack3.getQuantity());

        // Customer 2 buys 2 of snack 4
        custy2.makePurchase(2, snack4);

        // Print Customer 2 cash on hand
        System.out.println(custy2.getCash());

        // Print quantity of snack 4
        snack4.getQuantity();

        // Customer 1 finds $10
        custy1.addCash(10);

        // Print Customer 1 cash on hand
        System.out.println(custy1.getCash());

        // Customer 1 buys 1 of snack 2
        custy1.makePurchase(1, snack2);

        // Print Customer 1 cash on hand
        System.out.println(custy1.getCash());

        // Print quantity of snack 2
        System.out.println(snack2.getQuantity());

        // Add 12 more items to snack 3
        snack3.setAddQuantity(12);

        // Print quantity of snack 3
        System.out.println(snack3.getQuantity());

        // Customer 2 buys 3 of snack 3
        custy2.makePurchase(3, snack3);

        // Print Customer 2 cash on hand
        System.out.println(custy2.getCash());

        // Print quantity of snack 3
        System.out.println(snack3.getQuantity());

    }

}