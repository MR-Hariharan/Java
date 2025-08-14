package date1308;
import java.util.Scanner;
import java.text.spi.CollatorProvider;
import java.util.Collections;
import java.util.Stack;

public class Stringtest1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    System.out.println();
    System.out.println(decoding(input));
}
public static String decoding(String s){
Stack<Integer> count = new Stack<>();
Stack<String> string = new Stack<>();
String cur = "";
int i = 0;
for(char c : s.toCharArray()){
    if(Character.isDigit(c)){
         i = i * 10 + (c - '0');
    }
    else if (c == '['){
        count.push(i);
        string.push(cur);
        i = 0;
        cur="";
    }
    else if (c == ']'){
      StringBuilder temp = new StringBuilder(string.pop());
      int r = count.pop();
      temp.append(cur.repeat(r));
      cur = temp.toString();
    }
    else{
        cur+=c;
    }
}
return cur;
}
}
