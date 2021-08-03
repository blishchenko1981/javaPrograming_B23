package day39_CustomClass_Staics.salaryCalculatorClass;

public class EmployeeSalaries {
    public static void main(String[] args) {
        SalaryCalculator employee1 = new SalaryCalculator();
        employee1.setInfo(65,0.07, 0.23, 45);
        System.out.println(employee1);

        SalaryCalculator employee2 = new SalaryCalculator();
        employee2.setInfo(54, 0.07, 0.25, 40);
        System.out.println(employee2);




    }
}
/*
SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

        Actions:
            setInfo(): sets all the fields of SalaryCalculator
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
            stateTax(): claculates the totalstateTax
            federalTax(): calculates the total federal tax
            salaryAfterTax(): calculates the salary after tax
            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */