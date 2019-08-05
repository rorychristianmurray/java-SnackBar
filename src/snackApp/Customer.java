package snackApp;

public class Customer {
    private static int maxId = 0;
    private int id;
    private String name;
    private double cash;

    public Customer(String name, double cash)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cash = cash
   
    }

    public void addCash(double add)
    {
        this.cash = this.cash + add
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCash() {
        return cash;
    }

    // Buy given total cash used in purchase **Review this**

    public void makePurchase(int quantity, Snack snack) {
        this.cash = this.cash - snack.buySnack(quantity);
    }

}