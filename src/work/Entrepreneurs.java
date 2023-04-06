package work;

public class Entrepreneurs extends Person {

    private double Revenue;
    private double Expenses;
    private double profit;


    public Entrepreneurs(String name, double Revenue, double Expenses) {
        super();

        this.Revenue = Revenue;
        this.Expenses = Expenses;
        this.profit = this.Revenue - this.Expenses;
    }


    @Override
    public String toString() {
        return "Entrepreneurs{name is " + this.getName() + " revenue is " + this.Revenue + " Expenses are " + this.Expenses;


    }

    public double calculateDiscount(double price) {
        double discountAmount = price * 0.02;
        double discountedPrice = price - discountAmount;
        return discountedPrice;
    }

    public void printItemDiscount(double price) {
        double discountedPrice = calculateDiscount(price);
        System.out.println("Original price: $" + price);
        System.out.println("Discounted price: $" + discountedPrice);
    }

    @Override
    public void printPay(){

        System.out.println("Entrepreneur's Pay is :" + this.profit);
    }
}


