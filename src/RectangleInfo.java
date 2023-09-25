import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = 0;
        int width = 0;
        int area = 0;
        int diagonal = 0;
        String trash = ""; // use for bad input which will read as a String
        boolean done = false;


        do {
            System.out.println("What is the Legth? ");
            if (input.hasNextDouble()) {
                // OK safe to read in a double
                length = input.nextInt();
                input.nextLine(); // clears the newline from the buffer
                done = true;  // because we got a valid number we can end the loop
            } else {
                // Not a double can’t use nextDouble() read as String with nextLine() instead
                trash = input.nextLine();
                System.out.println("You said you had " + trash);
                System.out.println("Which is invalid");
            }
            System.out.println("What is the width? ");
            if (input.hasNextDouble()) {
                // OK safe to read in a double
                width = input.nextInt();
                input.nextLine(); // clears the newline from the buffer
                done = true;  // because we got a valid number we can end the loop
            } else {
                // Not a double can’t use nextDouble() read as String with nextLine() instead
                trash = input.nextLine();
                System.out.println("You said you had " + trash);
                System.out.println("Which is invalid");
            }

            area = length * width;

            diagonal = (int) Math.sqrt((length*length)+(width*width));

            System.out.println("The area is " + area );
            System.out.println("The diagonal is " + diagonal);




        }while(true);
    }
}
