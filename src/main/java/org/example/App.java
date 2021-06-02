package org.example;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        //Variables
        int principle, years, compoundRate;
        double rate;

        System.out.print("Enter the principle amount: $");
        principle = scanner.nextInt();
        System.out.print("Enter the rate (as %): ");
        rate = scanner.nextInt();
        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();
        System.out.print("Enter the compounds per year: ");
        compoundRate = scanner.nextInt();

        double result = calculateInterest(principle, rate, years, compoundRate);
        System.out.printf("The final amount after %d year(s) would be $%.2f\n", years, result);
    }

    private static double calculateInterest(int principle, double rate, int years, int compoundRate) {
        int totalCompounds = years * compoundRate;
        double result = principle;
        rate = rate / 100;

        for (int i = 0; i < totalCompounds; i++){
            result += result * rate;
            System.out.printf("Compound: %2d | Amount: %5.2f\n", i + 1 , result);
        }

        return result;
    }
}
