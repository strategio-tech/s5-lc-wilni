package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * This method calculates the amount of interest paid over three months
     * and returns the amount after interest payments
     * @param int Amount - total amount borrowed
     * @return int amount - amount left after 3 months of 10% interest being paid
     */
    static int getRemainingAmountIn3Months(int amount) {
        // TODO: Add your code below
        for(int i = 0; i < 3; i++){
            double interest = amount * 0.1;
            amount -= interest;
        }
        return (int)amount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        System.out.println(getRemainingAmountIn3Months(amount));
    }
}
