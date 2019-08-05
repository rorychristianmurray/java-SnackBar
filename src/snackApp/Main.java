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

        // Begin actions
        System.out.println("Snack Bar line begins here");

        // Customer 1 buys 3 of snack 4
        custy1.makePurchase(snack4.totalCost(3));
        snack4.buySnack(3);

        // Print Customer 1 cash on hand
        System.out.println("Customer 1 has " + custy1.getCash() + " cash on hand");

        // Print quantity of snack 4
        System.out.println("There are " + snack4.getQuantity() + " amount of Snack 4 left");

        // Customer 1 buys 1 of snack 3
        custy1.makePurchase(snack3.totalCost(1));
        snack3.buySnack(1);

        // Print Customer 1 cash on hand
        System.out.println("Customer 1 has " + custy1.getCash() + " cash on hand");

        // Print quantity of snack 3
        System.out.println("There are " + snack3.getQuantity() + " amount of Snack 3 left");

        // Customer 2 buys 2 of snack 4
        custy2.makePurchase(snack4.totalCost(2));
        snack4.buySnack(2);

        // Print Customer 2 cash on hand
        System.out.println("Customer 2 has " + custy2.getCash() + " cash on hand");

        // Print quantity of snack 4
        System.out.println("There are " + snack4.getQuantity() + " of Snack 4 left");

        // Customer 1 finds $10
        custy1.addCash(10);

        // Print Customer 1 cash on hand
        System.out.println("Customer 1 has " + custy1.getCash() + " amount of cash on hand");

        // Customer 1 buys 1 of snack 2
        custy1.makePurchase(snack2.totalCost(1));
        snack2.buySnack(1);

        // Print Customer 1 cash on hand
        System.out.println("Customer 1 has " + custy1.getCash() + " amount of cash on hand");

        // Print quantity of snack 2
        System.out.println("There are " + snack2.getQuantity() + " amount of Snack 2 left");

        // Add 12 more items to snack 3
        snack3.setAddQuantity(12);

        // Print quantity of snack 3
        System.out.println("There are " + snack3.getQuantity() + " amount of Snack 3 left");

        // Customer 2 buys 3 of snack 3
        custy2.makePurchase(snack3.totalCost(3));
        snack3.buySnack(3);

        // Print Customer 2 cash on hand
        System.out.println("Customer 2 has " + custy2.getCash() + " amount of cash on hand");

        // Print quantity of snack 3
        System.out.println("There are " + snack3.getQuantity() + " amount of Snack 3 left");

    }

}