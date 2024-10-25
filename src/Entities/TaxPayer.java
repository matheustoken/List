package Entities;
import java.util.ArrayList;



import Entities.CalculateTax;

import java.util.List;

import java.util.Scanner;

public class TaxPayer {

    public TaxPayer(double anualSalaryIncome, double anualServicesIncome, double anualCapitalIncome,

                    double healthSpending, double educationSpending) {

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        List<CalculateTax> list = new ArrayList<>();

        System.out.print("Digite o número de contribuintes: ");

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Contribuinte " + i + ":");

            System.out.print("Qual é o salário anual: ");

            double anualSalaryIncome = scanner.nextDouble();

            System.out.print("Qual é o salário com Prestação de Serviço: ");

            double anualServicesIncome = scanner.nextDouble();

            System.out.print("Qual é o salário com Ganho de Capital: ");

            double anualCapitalIncome = scanner.nextDouble();

            System.out.print("Gastos Médicos: ");

            double healthSpending = scanner.nextDouble();

            System.out.print("Gastos Educacionais: ");

            double educationSpending = scanner.nextDouble();

            CalculateTax taxPayer = new CalculateTax(anualSalaryIncome, anualServicesIncome, anualCapitalIncome, healthSpending, educationSpending);

            taxPayer.calculateTaxes();

            list.add(taxPayer);

        }

        System.out.println("\nRESUMO DOS IMPOSTOS:");

        for (int i = 0; i < list.size(); i++) {

            CalculateTax taxPayer = list.get(i);

            System.out.println("Contribuinte #" + (i + 1) + ":");

            System.out.printf("Imposto bruto total: %.2f%n", taxPayer.getGrossTax());

            System.out.printf("Abatimento: %.2f%n", taxPayer.getTaxRebate());

            System.out.printf("Imposto devido: %.2f%n", taxPayer.getNetTax());

            System.out.println("-------------------------");

        }

        scanner.close();

    }





}