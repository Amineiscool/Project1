package work;

public class Manager extends Employee {


    @Override
    public void printBadge() {

    }

    public Manager(double salary) {

        super(salary);
    }

    @Override
    public double calculateDiscount() {
        double baseDiscount = super.calculateDiscount();
        double additionalDiscount = getSalary() * 0.05;
        double totalDiscount = baseDiscount + additionalDiscount;
        return totalDiscount;
    }

    @Override
    public void printPay() {

    }
}