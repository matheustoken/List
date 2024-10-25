package Entities;

public class CalculateTax {

    private double anualSalaryIncome, anualServicesIncome, anualCapitalIncome, healthSpending, educationSpending;

    private double salaryIncome, salaryTax, serviceTax, capitalTax;

    private double dedMaxDedut, spendingMaxDedut, grossTax, taxRebate, netTax;


    public CalculateTax(double anualSalaryIncome, double anualServicesIncome, double anualCapitalIncome, double healthSpending, double educationSpending) {

        this.anualSalaryIncome = anualSalaryIncome;

        this.anualServicesIncome = anualServicesIncome;

        this.anualCapitalIncome = anualCapitalIncome;

        this.healthSpending = healthSpending;

        this.educationSpending = educationSpending;
    }

    public double calculateSalaryTax() {

        salaryIncome = anualSalaryIncome / 12;

        if (salaryIncome < 3000) {
            return 0;

        } else if (salaryIncome <= 5000) {

            return 0.1 * anualSalaryIncome;

        } else {

            return 0.2 * anualSalaryIncome;

        }

    }

    public double calculateServiceTax() {

        if (anualServicesIncome <= 0) {

            return 0;

        } else {

            return anualServicesIncome * 0.15;

        }

    }

    public double calculateCapitalTax() {

        if (anualCapitalIncome <= 0) {

            return 0;

        } else {

            return anualCapitalIncome * 0.2;

        }

    }

    public void calculateTaxes() {

        salaryTax = calculateSalaryTax();

        serviceTax = calculateServiceTax();

        capitalTax = calculateCapitalTax();

        spendingMaxDedut = healthSpending + educationSpending;

        grossTax = salaryTax + serviceTax + capitalTax;

        dedMaxDedut = grossTax * 0.30;

        if (spendingMaxDedut / grossTax >= 0.30) {

            taxRebate = dedMaxDedut;

        } else {

            taxRebate = spendingMaxDedut;

        }

        netTax = grossTax - taxRebate;

    }

    public double getSalaryTax() {

        return salaryTax;

    }

    public void setSalaryTax(double salaryTax) {

        this.salaryTax = salaryTax;

    }

    public double getServiceTax() {

        return serviceTax;

    }

    public void setServiceTax(double serviceTax) {

        this.serviceTax = serviceTax;

    }

    public double getCapitalTax() {

        return capitalTax;

    }

    public void setCapitalTax(double capitalTax) {

        this.capitalTax = capitalTax;

    }

    public double getSpendingMaxDedut() {

        return spendingMaxDedut;

    }

    public void setSpendingMaxDedut(double spendingMaxDedut) {

        this.spendingMaxDedut = spendingMaxDedut;

    }

    public double getGrossTax() {

        return grossTax;

    }

    public void setGrossTax(double grossTax) {

        this.grossTax = grossTax;

    }

    public double getTaxRebate() {

        return taxRebate;

    }

    public void setTaxRebate(double taxRebate) {

        this.taxRebate = taxRebate;

    }

    public double getNetTax() {

        return netTax;

    }

    public void setNetTax(double netTax) {

        this.netTax = netTax;

    }
}


