import java.util.Scanner;

public class CountingValleys {

    public static int countingValleys(int n, String steps) {
        int level = 0; // Current level
        int valleys = 0; // Number of valleys
        boolean inValley = false; // Flag to check if we are in a valley

        for (char step : steps.toCharArray()) {
            if (step == 'U') {
                level++; // Step up
            } else if (step == 'D') {
                level--; // Step down
            }

            // Check if we just came up to sea level
            if (level == 0 && inValley) {
                valleys++; // We completed a valley
                inValley = false; // Reset valley flag
            }

            // Check if we are in a valley
            if (level < 0) {
                inValley = true; // We are in a valley
            }
        }

        return valleys;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of steps
        int n = scanner.nextInt();
        // Read the sequence of steps
        String steps = scanner.next();

        // Call the countingValleys function and print the result
        int result = countingValleys(n, steps);
        System.out.println(result);

        scanner.close();
    }
}