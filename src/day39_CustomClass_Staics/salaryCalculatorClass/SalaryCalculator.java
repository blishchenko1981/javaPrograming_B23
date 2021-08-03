package day39_CustomClass_Staics.salaryCalculatorClass;

import java.text.DecimalFormat;

public class SalaryCalculator {

    public double hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public int weeklyHours;

    public void setInfo(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary (){
        return (hourlyRate*weeklyHours)*52;
    }

     public double stateTax(){
        return salary() * stateTaxRate;
     }

     public double federalTax(){
        return salary()*federalTaxRate;
     }

     public  double salaryAfterTax(){
        return salary() - stateTax() - federalTax();
     }





    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0");
        return "SalaryCalculator{" +
                "salary + $" + df.format(salary()) +
                ", hourlyRate=" + hourlyRate +
                ", stateTax=" + df.format(stateTax()) +
                ", federalTax=" + df.format(federalTax() )+
                ", salaryAfterTax= " + df.format(salaryAfterTax()) +
                '}';
    }




}
