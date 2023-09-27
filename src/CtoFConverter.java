import java.util.Objects;
import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c;
        double f;
        String trash = ""; // use for bad input which will read as a String
        boolean done = false;
        String hi = "";

        boolean stop = false;
        do {
            System.out.println("What is the temperature in C? ");
            if (input.hasNextDouble()) {
                // OK safe to read in a double
                c = input.nextDouble();
                input.nextLine(); // clears the newline from the buffer
                done = true;  // because we got a valid number we can end the loop
                f = (c * 1.8) + 32;
                System.out.println("This is the temperature in F: " + f);
            } else {
                // Not a double can’t use nextDouble() read as String with nextLine() instead
                trash = input.nextLine();
                System.out.println("You said the temp was " + trash);
                System.out.println("Which is invalid");
            }




        } while (!false);
    }
}