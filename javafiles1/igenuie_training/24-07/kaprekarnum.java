import java.util.*;
public class kaprekarnum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        int number = scanner.nextInt();
        scanner.close();
        if (number < 0) {
            System.out.println("Kaprekar numbers are non-negative.");
            return; 
        }
        if (isKaprekar(number)) {
            System.out.println(number + " is a Kaprekar number.");
        } else {
            System.out.println(number + " is NOT a Kaprekar number.");
        }
        System.out.println("Kaprekar Numbers up to 1000");
        for (int i = 1; i <= 1000; i++) {
            if (isKaprekar(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n------------------------------------");
    }
    public static boolean isKaprekar(int num) {
        if (num == 0 || num == 1) {
            return true;
        }
        long square = (long) num * num; 
        String sSquare = String.valueOf(square);
        int len = sSquare.length();
        for (int i = 1; i < len; i++) {
            String part1Str = sSquare.substring(0, i);
            String part2Str = sSquare.substring(i);
            int part1 = Integer.parseInt(part1Str);
            int part2 = Integer.parseInt(part2Str);
            if (part2 != 0 && (part1 + part2 == num)) {
                return true; 
            }
        }
        return false;
    }
}

