import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double galInTank = 0.0;
        double mPerGal = 0.0;
        double pPerGal = 0.0;
        double hPrice = 0.0;
        double mLeft = 0.0;
        String trash = ""; // use for bad input which will read as a String
        boolean done = false;


        do {
            System.out.println("How many gallons do you have? ");
            if (input.hasNextDouble()){
                // OK safe to read in a double
                galInTank = input.nextDouble();
                input.nextLine(); // clears the newline from the buffer
                done = true;  // because we got a valid number we can end the loop
            }
            else
            {
                // Not a double can’t use nextDouble() read as String with nextLine() instead
                trash = input.nextLine();
                System.out.println("You said you had " + trash);
                System.out.println("Which is invalid");
            }


            System.out.println("What is your fuel efficiency per gallon? ");
            if (input.hasNextDouble()){
                // OK safe to read in a double
                mPerGal = input.nextDouble();
                input.nextLine(); // clears the newline from the buffer
                done = true;  // because we got a valid number we can end the loop
            }
            else
            {
                // Not a double can’t use nextDouble() read as String with nextLine() instead
                trash = input.nextLine();
                System.out.println("You said you had this efficiency" + trash);
                System.out.println("Which is invalid");
            }

            System.out.println("What is the price per gallon? ");
            if (input.hasNextDouble()){
                // OK safe to read in a double
                pPerGal = input.nextDouble();
                input.nextLine(); // clears the newline from the buffer
                done = true;  // because we got a valid number we can end the loop
            }
            else
            {
                // Not a double can’t use nextDouble() read as String with nextLine() instead
                trash = input.nextLine();
                System.out.println("You said you had this price" + trash);
                System.out.println("Which is invalid");
            }

            hPrice = pPerGal * 100;
            System.out.println("The price for 100 miles is: " + hPrice);

            mLeft = galInTank * mPerGal;
            System.out.println("You have this: " + mLeft + " many miles left");


        } while (true);
    }
}
