import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sockmercant {

    public static int sockMerchant(int n, int[] ar) {
                Map<Integer, Integer> colorCount = new HashMap<>();

              for (int color : ar) {
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
        }

        int pairs = 0;

        for (int count : colorCount.values()) {
            pairs += count / 2;         }

        return pairs;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);

        scanner.close();
    }
}