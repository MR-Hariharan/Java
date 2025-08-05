import java.util.Scanner;
public class ifelse {
    //nested if
    public static void main (String args[]){
        /*System.out.print("enter the mark obtained:");
     Scanner sc = new Scanner(System.in);
     int score = sc.nextInt();
     if(score>60){
        System.out.println("android");
        if(score>70){
            System.out.println("iphone");
                if(score>80){
                    System.out.println("bike");
                }    
            }
        }
        else {
            System.out.println("retest");
     }
     sc.close();*/
     //else if 
     System.out.print("enter the mark obtained:");
     Scanner sc = new Scanner(System.in);
     int score = sc.nextInt();
     if(score>60 && score<70){
        System.out.println("android");
     }
    if(score>70 &&score<80){
        System.out.println("iphone");
    }
     if(score>=80){
        System.out.println("bike");
         }
     sc.close();
    }
}
    

