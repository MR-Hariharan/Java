import java.util.Scanner;
public class leapyear {
    public static void main (String args[]){
        System.out.println("enter the year:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if((n%400==0)||
            (n%4==0) && (n%100 !=0)){
                System.out.println("given year is leap year");
            }
    else {
        System.out.println("given year is not a leap year");
    }
}
}
