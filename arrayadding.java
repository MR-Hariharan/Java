import java.util.*;
public class arrayadding {
    public static void main(String args[]){
        int a[]={2,3,4,5};
        int b[]={7,6,5,5};
        int c[] =new int[5];
        int n=a.length;
        int carry=0;
        for(int i=n-1;i>=0;i--){
                int sum=a[i]+b[i]+carry;
                c[i+1]=sum%10;
                carry=sum/10;
                c[0]=carry;
        }
        //for(int i=0;i<c.length;i++){
            System.out.print(Arrays.toString(c));
        }
        }
    

