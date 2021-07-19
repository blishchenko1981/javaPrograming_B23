package day03;

public class SalaryCalculator {
    public static void main(String[] args) {
         int hourlyRate = 23;
         int weeklyHours = 40;
         int numberOfWeeks = 52;
         double taxRate = 0.32;
         int salary = hourlyRate * weeklyHours * numberOfWeeks ;
        System.out.println(salary);
        double totalTax = salary*taxRate;
        double salaryAfterTax= salary-totalTax;
        System.out.println("salaryAfterTax = " + salaryAfterTax);






    }




}
