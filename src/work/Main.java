package work;

public class Main {
    public static void main(String[] args) {



        HourlyEmployees hourlyEmployee = new HourlyEmployees ("jane", 40,100);

        SalariedEmployee salariedEmployee = new SalariedEmployee("mike",30000);

        Entrepreneurs entrepreneur = new Entrepreneurs("mike.z", 10000,100);

         hourlyEmployee.printBadge();

        salariedEmployee.printBadge();

        hourlyEmployee.printPay();

        salariedEmployee.printPay();

        System.out.println(entrepreneur);














    }



}
