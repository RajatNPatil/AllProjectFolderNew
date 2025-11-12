package Assignment;

import java.util.*;

public class IncomeTaxCalculator {

    // Method to calculate tax based on slabs

    static double calculateTax(double ctc) {

        double tax = 0;

        if (ctc <= 180000) {

            tax = 0;
        } 
        else if (ctc <= 300000) {

            tax = (ctc - 180000) * 0.10;
        } 
        else if (ctc <= 500000) {

            tax = (120000 * 0.10) + (ctc - 300000) * 0.20;
        } 
        else if (ctc <= 1000000) {

            tax = (120000 * 0.10) + (200000 * 0.20) + (ctc - 500000) * 0.30;
        } 
        else {

            // You can add logic here for incomes above 10,00,000 if needed

            tax = (120000 * 0.10) + (200000 * 0.20) + (500000 * 0.30);
        }
        return tax;
    }

    // Main method

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your CTC: ");

        double ctc = sc.nextDouble();

        double tax = calculateTax(ctc);

        System.out.println("Total tax payable: ₹" + tax);

    }

}
 
