import java.util.*;
public class reverseaword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String s = sc.nextLine();
        String[] words = s.trim().split("\\s+");
        StringBuilder output = new StringBuilder();
        sc.close();
        for (int i = words.length - 1; i >= 0; i--) {
            output.append(words[i]);
            if (i > 0){
                 output.append(" ");
                }
            }
            System.out.println(output.toString());
        }
    }  