package day04_Variables;

public class TaxCalculation {
    public static void main(String[] args) {
        int salary = 75000;
        double stateTax = 0.08;
        double federalTax = 0.21;

        double totalStateTax = salary* stateTax;
        double totalFederalTax = salary * federalTax;
        double salaryAfterTax = salary - totalFederalTax - totalStateTax;

        System.out.println("You salary is $"+ salary);
        System.out.println( "you need to pay " + totalStateTax + "  To state tax");
        System.out.println( "you need to pay " + totalFederalTax + "  To federal tax");
        System.out.println(" You take home salary is $"+ salaryAfterTax );


    }




}
