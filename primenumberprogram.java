import java.util.*;
class aiml{
    public int number(int n){
        int rem;
        int rev=0; 
        if(n<=1)
        for (int i=2;i<n;i++){
            if(n%i!=0)
            {
                System.out.println("prime");
            }
            else if(rev%i!=0)
            {
                System.out.println("prime");
            }
            else{
                System.out.println("not a prime");
            }
            while(n>0){
                rem=n%10;
                rev=rev* + rem;
                n=n/10;        
            }
        }
        return 0;
    }   
}
public class primenumberprogram {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the integer:");
        int n=sc.nextInt();
        aiml s=new aiml();
        
        sc.close();
}
}