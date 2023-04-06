package work;

public  class SalariedEmployee extends  Employee {

private double salary;
private double pay;
private int daysYear = 365;
private int daysWeek = 7;


    public SalariedEmployee(String name, double salary ) {
        super(name);

        this.salary = salary;
        this.pay = this.salary/this.daysYear * this.daysWeek;

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPay() {
        return pay;
    }


    @Override
    public void printBadge(){

        System.out.println("SalariedEmployee : " + this.getName());
        System.out.println("EmployeeID : " + this.getId());

    }

    @Override
    public void printPay() {
        System.out.println("Salaried  Employee's Pay is : " + this.pay );
    }


    @Override
    public double calculateDiscount(double price) {

        double discountAmount = price * 0.10;
        double discountedPrice = price - discountAmount;
        return discountedPrice;

    }
    @Override
    public  void printItemDiscount(double price) {
        double discountedPrice = calculateDiscount(price);
        System.out.println("Original price: $" + price);
        System.out.println("Discounted price: $" + discountedPrice);
    }

}
