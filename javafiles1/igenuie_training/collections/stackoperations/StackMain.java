package collections.stackoperations;
import java.util.*;
public class StackMain {
    public static void main(String[] args) {
        // Stack s = new Stack(5);
        // Stack s1 = new Stack(5);
        // Stack temp = new Stack(5);
        // Stack output  =new Stack(5);
        // System.out.println("Stack 1:");
        // s.push(5);
        // s.push(4);
        // s.push(3);
        // s.push(2);
        // s.push(1);
        // s.display();
        // System.out.println("Stack 2");
        // s1.push(5);
        // s1.push(4);
        // s1.push(3);
        // s1.push(2);
        // s1.push(1);
        // s1.display();
            
                   // adding two stack 

        // while (!s.isEmpty() && !s1.isEmpty()) {
        //     int v1 = s.pop();
        //     int v2 = s1.pop();
        //     output.push(v1+v2);
        // }
        // System.out.println();
        // output.display();

                    //storing in temp

        // while (!s.isEmpty()) {
        //     int v =  s.pop();
        //     temp.push(v);
        // }
        // System.out.println("reversed stack:");
        // temp.display();



        // alternative push
        //  Stack s = new Stack(3);
        // Stack s1 = new Stack(5);
        // Stack output = new Stack(9);
        // System.out.println("Stack 1:");
        // s.push(2);
        // s.push(4);
        // s.push(6);
        // s.display();
        // System.out.println("Stack 2:");
        // s1.push(1);
        // s1.push(3);
        // s1.push(5);
        // s1.push(7);
        // s1.push(9);
        // s1.display();
        // while (!s.isEmpty() && !s1.isEmpty()) {
        //     int v1 = s.pop();
        //     int v2 = s1.pop();
        //     output.push(Math.max(v1, v2));
        //     if (v1<v2) {
        //         s.push(v1);   
                
        //     }
        //     else{
        //         s1.push(v2);
        //     }
        // }
        // while (!s.isEmpty()) {
        //     output.push(s.pop());            
        // }
        //  while (!s1.isEmpty()) {
        //     output.push(s1.pop());            
        // }
        // System.out.println();
        // output.display();


    //     String input = "java";
    //     int n = input.length();
    //     Stack s1 = new Stack(n);
    //     String output = " ";
    //    for(int i = 0; i < n; i++){
    //       s1.push(String.valueOf(input.charAt(i)));
    //    }
    //     while(!s1.isEmpty()){
    //        System.out.print(s1.pop()); 
    //     }
    //     System.out.println();

    String input = "aabcddbe";
    int n  = input.length();
    Stack s1 = new Stack(n);
    String output = "";
    for(int i = 0; i < n; i++){
        s1.push(String.valueOf(input.charAt(i)));
    }


    }
}
