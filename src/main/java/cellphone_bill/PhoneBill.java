package cellphone_bill;

import java.util.Scanner;

public class PhoneBill {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        System.out.println("Enter the base cost of your plan");
        double planCost = scanner.nextDouble();

        System.out.println("Enter overage minutes:");
        int minutes = scanner.nextInt();

        double overage = calculateOverage(minutes);
        double tax = calculateTax(planCost + overage);
        calculateTotal(planCost,overage,tax);

    }

    public static double calculateOverage(int minutes) {
        double rates = 0.25;
        return minutes * rates;
    }

    public static double calculateTax(double subTotal) {
        double rates = .15;
        return subTotal * rates;
    }

    public static void calculateTotal(double planCost,double overage, double tax) {

        double subTotal = planCost + overage + tax;

        System.out.println("Phone bill statements");
        System.out.println("Plan = " + planCost);
        System.out.println("Overage = " + overage);
        System.out.println("Tax = " + tax);
        System.out.println("Total = " +subTotal);


    }
}
