import java.util.Scanner;
public class MetricConverter {
    public static void main(String[] args) {
        double user = 0.0;
        double miles = 0.0;
        double feet = 0.0;
        double inches = 0.0;
        String trash = ""; // use for bad input which will read as a String
        boolean done = false;
        boolean again = false;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("What is the measurement you have in meters? ");
            if (input.hasNextDouble()) {
                // OK safe to read in a double
                user = input.nextDouble();
                input.nextLine(); // clears the newline from the buffer
                done = true;  // because we got a valid number we can end the loop
            } else {
                // Not a double can’t use nextDouble() read as String with nextLine() instead
                trash = input.nextLine();
                System.out.println("You said you had " + trash);
                System.out.println("Which is invalid");
            }

            miles = user * .00062137;
            feet = user * 3.28084;
            inches = user * 39.3701;
            System.out.println("Meters to Miles: " + miles);
            System.out.println("Meters to Feet: " + feet);
            System.out.println("Meters to Inches: " + inches);


            System.out.print("Do you want to keep going? (Y/N): ");
            String keepG = input.nextLine().trim().toLowerCase();
            if (!keepG.equals("y")) {
                again = true;
            }

        } while (!again);


    }
}
