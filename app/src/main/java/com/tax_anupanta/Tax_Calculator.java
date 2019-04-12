package com.tax_anupanta;

public class Tax_Calculator {

    private double salary;
    private double tax;


    public Tax_Calculator(double salary) {

        this.salary=salary;
    }

    public double Tax(){
        salary= salary*12;

        if (salary>1 && salary<200000){
            tax = salary * 15/100;

        }
        else if (salary>200000 && salary <350000) {
            tax = (200000 * 1/100) +(salary-200000)*15/100;
        }
        else if (salary>350000) {
            tax = 200000 * 1/100 +150000*15/100+ (salary - 350000)*25/100;
        }
        return tax;
    }
}