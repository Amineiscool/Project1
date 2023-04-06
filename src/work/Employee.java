package work;

public abstract class Employee extends Person implements Payable {

    private int id;
    static int uniqueID = 0;

    //creating a constructor for employees
    public Employee (String name){
        super();
        this.id = ++uniqueID;

    }

    public int getId() {

        return this.id;



    }

    public abstract void printBadge();




    private double salary;

    public Employee(double salary) {
        super();
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateDiscount() {
        double discountAmount = salary * 0.10;
        double discountedPrice = salary - discountAmount;
        return discountedPrice;
    }
}





