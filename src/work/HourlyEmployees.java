package work;

public  class HourlyEmployees extends Employee{

    private double HourlyPay;
    private double HoursWorked;
    private double Pay;


    public HourlyEmployees(String name, double HourlyPay, double HoursWorked) {
        super(name);

        this.HourlyPay = HourlyPay;
        this.HoursWorked = HoursWorked;
        this.Pay = this.HoursWorked * this.HourlyPay;

    }

    public double getHourlyPay() {
        return HourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        HourlyPay = hourlyPay;
    }

    public double getHoursWorked() {
        return HoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        HoursWorked = hoursWorked;
    }






    @Override
    public void printBadge() {
        System.out.println("HourlyEmployee : " + this.getName() );
        System.out.println("EmployeeID : " + this.getId());

    }


    @Override
    public void printPay() {
        System.out.println("Hourly Employee's Pay is : " + this.Pay );

    }



    @Override
    public double calculateDiscount(double price) {

        double discountAmount = price * 0.10;
        double discountedPrice = price - discountAmount;
        return discountedPrice;

    }
    @Override
    public void printItemDiscount(double price) {
        double discountedPrice = calculateDiscount(price); // calculate the discounted price
        System.out.println("Original price: $" + price);
        System.out.println("Discounted price: $" + discountedPrice);
    }
}


