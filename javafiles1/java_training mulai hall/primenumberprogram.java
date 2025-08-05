import java.util.*;
public class primenumberprogram {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the integer:");
        int n=sc.nextInt();
        sc.close();
        int count;
        for(int i=0;i<n;i++){
            count =0;
        for (int j=2;j<Math.sqrt(n);j++){
            if(i%j==0){
                count++;
            }
        }
        if(count==1){
            System.out.print(i+",");
        }
    }
}
}