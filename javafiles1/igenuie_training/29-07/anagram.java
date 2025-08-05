import java.util.*;
public class anagram {
    public static void main(String[] args){
        String str1 = "gum";
        String str2 = "mug";
        int[] arr = new int[256];
        if(str1.length()!=str2.length()){
             System.out.println("not a anagram");
             return;
        }
            for(int i = 0; i < str1.length(); i++){
                arr[str1.charAt(i) -'a'] ++;
                arr[str2.charAt(i) -'a'] --;
            }
            for(int i =0; i < 256; i++){
                if(arr[i]!=0){
                    System.out.println("not a anagram");
                    break;
                }
                else{
                    System.out.println("anagram");
                    break;
                }
            }
    }
}
