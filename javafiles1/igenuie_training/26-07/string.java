import java.util.*;
public class string {
    public static void main(String[] args){
        String str = "HAriharAn";
        String ans = "";
        for(char ch : str.toCharArray()){
            if("auieoAEIOU".indexOf(ch)==-1){
                ans+=ch;
            }
        }
        for(char c : str.toCharArray()){
        }
        System.out.println(ans);
        System.out.println(str.charAt(3));
        System.out.println(str.substring(3));
        System.out.println(str.indexOf(3));
        System.out.println(str.lastIndexOf(3));
        System.out.println(str.length());
        System.out.println(str.trim());
        System.out.println(str.isEmpty());
        System.out.println(str.toUpperCase());
        System.out.println(str.compareTo("hello"));

    }
}

