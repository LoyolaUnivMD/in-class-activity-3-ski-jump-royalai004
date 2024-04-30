import java.util.Scanner;
import java.text.DecimalFormat;

class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Phone Bill Activity!");
        DecimalFormat mon = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        double monthly = 0;
        double extra = 0;
        double additional = 0;
        double bill = 0;
        String coupon = "No";

        System.out.println("Hello, what package subscription do you have with us? ");
        String packageType = input.next().toLowerCase();

        System.out.println("How much data did you use this month? ");
        double data = input.nextDouble();

        if (packageType.equals("green")) {
            monthly = 49.99;
            extra = data - 2;
            additional = 15;
            System.out.println("Do you have a coupon (Yes or No)?");
            coupon = input.next().toLowerCase();
        } else if (packageType.equals("blue")) {
            monthly = 70;
            extra = data - 4;
            additional = 10;
        } else if (packageType.equals("purple")) {
            monthly = 99.95;
            extra = 0;
            additional = 0;
        } else {
            System.out.println("Invalid package name. Can't calculate a price.");
            packageType = "invalid";
        }

        if (!packageType.equals("invalid")) {
            if (extra > 0) {
                bill = monthly + extra * additional;
            } else {
                bill = monthly;
            }
            if (coupon.toLowerCase().equals("yes") && bill >= 75) {
                bill = bill - 20;
            }
            System.out.println("Your bill is $" + mon.format(bill)); // Output bill
        }
    }
}
