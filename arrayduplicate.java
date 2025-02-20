import java.util.*;
import java.io.*;
public class arrayduplicate {
    public static void main (String [] args){
/*         int a[] ={8,7,5,4,5,7,1,13,556,75,3,2,2,5,1,7,3,8,7,8,9};
        int k = a.length;
        int b = -1;
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        for(int i=0;i<k;i++){
            if(a[i]!=-1){
            for(int j=i+1;j<k;j++){
                if( a[i]==a[j]){
                a[j]=b;
                }
            }
        System.out.println(a[i]);
            }
         }*/
         
                 int a[] ={8,7,5,4,5,7,8,7,8,9};
                 int temp[] = new int [a.length];
                 Arrays.sort(a);
                 int j = 0;
                 for ( int i = 0 ; i < a.length-1 ; i++){
                     if(a[i] != a[i+1]){
                         temp [j++] = a[i];
                     }
                 }
                         temp [j] = a[a.length-1];
                         for(int i = 0 ; i <= j ; i++){
                             System.out.print(temp[i] + ",");           
                   }
             }
    }