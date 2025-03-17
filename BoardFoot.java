import java.util.Scanner;

/**
 * This is the package for BoardFoot.java
 *
 * The BoardFoot program asks the user for width and height
 * It then calculates the length needed to make the volume 144m^3.
 *
 * <p>This class satisfies style checkers.</p>
 *
 * @author Val I
 * @version 1.0
 * @since 2025-02-28
 */
public final class BoardFoot {

    /**
     * This is a private constructor to satisfy style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private BoardFoot() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This method calculates the length needed to make the volume 144.
     *
     * @param width The width of the board.
     * @param height The height of the board.
     * @return The required length to achieve a volume of 144.
     */
    public static float calculateBoardFoot(final float width, final float height) {
        // Formula to calculate the length: volume = width * height * length
        // Rearranged to find length: length = volume / (width * height)

        final float volume = 144.0f;
        return volume / (width * height);
    }

    /**
     * This is the main method.
     *
     * @param args unused.
     */
    public static void main(final String[] args) {
        // Greet the user
        System.out.println("This program calculates the length needed to make the volume 144");
        System.out.println("When given the height and width.");

        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for height
            System.out.println("What's the height?");
            String heightStr = scanner.nextLine();
            final float height = Float.parseFloat(heightStr);

            // Validate height
            if (height > 0) {
                // Prompt user for width
                System.out.println("What's the width?");
                String widthStr = scanner.nextLine();
                final float width = Float.parseFloat(widthStr);
                // Validate width
                if (width > 0) {
                    // Call the function
                    float length = calculateBoardFoot(width, height);

                    // Display the result
                    System.out.printf("The required length is %.2f units.%n", length);
                } else {
                    System.out.println("Width must be greater than zero.");
                }
            } else {
                System.out.println("Height must be greater than zero.");
            }
        } catch (NumberFormatException ex) {
            // Handle invalid input
            System.out.println("Not a valid number.");
        } 
        // Close the scanner to free resources
        scanner.close();
    }
}
