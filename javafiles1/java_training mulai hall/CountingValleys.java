import java.util.Scanner;

public class CountingValleys {

    public static int countingValleys(int n, String steps) {
        int level = 0; 
        int valleys = 0;
        boolean inValley = false; 
        for (char step : steps.toCharArray()) {
            if (step == 'U') {
                level++; 
            } else if (step == 'D') {
                level--; 
            }
            if (level == 0 && inValley) {
                valleys++;
                inValley = false;         
      }

                      if (level < 0) {
                inValley = true; 
            }
        }

        return valleys;
    } n   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
              String steps = scanner.next();
        int result = countingValleys(n, steps);
        System.out.println(result);
        scanner.close(); 
    }
}





