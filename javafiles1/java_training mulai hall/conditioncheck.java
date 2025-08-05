import java.util.*;
public class conditioncheck {
    static boolean pronic(int a){
        int sum=0;
        int temp=a;
        while(temp>0){
        int digit=temp%10;
        sum +=digit;
        temp =temp/10;
        }
        return(a%sum==0); 
    }
    //static boolean abduntant(int a){

    //}
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        //condition s=new condition();
        System.out.println(pronic(a)?"yes":"no");

    }
}
