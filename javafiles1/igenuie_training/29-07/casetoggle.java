import java.util.*;
public class casetoggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String ans ="";
        for(char c : s1.toCharArray()){
            if(Character.isUpperCase(c)){
                ans += Character.toLowerCase(c);
                
            }
            else{
                ans+=Character.toUpperCase(c);
               
            }
        }
        System.out.println(ans);
    }
}
